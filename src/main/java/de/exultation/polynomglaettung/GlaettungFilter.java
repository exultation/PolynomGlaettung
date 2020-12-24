/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exultation.polynomglaettung;

import de.exultation.polynomglaettung.exeptions.WorngGradeExeption;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pebo
 */
public class GlaettungFilter
{

    Queue<Double> _inputQueue;

    Integer _grad = 0;
    SavitzkyGolayFilterKoeffizienten.SGKoefizient koefizient;

    public GlaettungFilter(int grad) throws WorngGradeExeption
    {
        if (grad >= 2 && grad <= 12)
        {
            _grad = grad;
            koefizient = SavitzkyGolayFilterKoeffizienten.Values[grad-2];
            _inputQueue = new LinkedList<>();

        }
        else
        {
            throw new WorngGradeExeption();
        }
    }

    public Double filter(Double value)
    {
        Double ret = value;
        Double tmp = 0.0;
        if (_inputQueue.size() == 0)
        {
            for (int i = 0; i <= _grad * 2; i++)
            {
                _inputQueue.add(value);

            }
        }

        _inputQueue.add(value);
        _inputQueue.poll();
        
        Double work[] = new Double[_grad * 2 + 1];
        work = _inputQueue.toArray(work);
        
        for (int i = 0; i < _inputQueue.size(); i++)
        {
            Integer valuePos = 0;
            if( i <= _grad)
            {
                valuePos = _grad - i;
                tmp +=  ((double)koefizient.values[valuePos] / koefizient.fNorm) * work[valuePos];
            }
            else
            {
                valuePos = i - _grad;
                
                tmp +=  ((double)koefizient.values[valuePos] / koefizient.fNorm) * work[valuePos];                
            }
            
        }

        return tmp;
    }

}
