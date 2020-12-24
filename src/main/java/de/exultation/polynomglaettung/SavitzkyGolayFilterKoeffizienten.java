/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exultation.polynomglaettung;

/**
 *
 * @author pebo
 */
public class SavitzkyGolayFilterKoeffizienten
{
    public static class SGKoefizient
    {
        Integer m ;
        Integer fNorm;
        Integer [] values;

        public SGKoefizient(Integer m, Integer fNorm, Integer[] values)
        {
            this.m = m;
            this.fNorm = fNorm;
            this.values = values;
        }
    };
    
    /**
     *
     */
    public static SGKoefizient [] Values = {    new SGKoefizient(2, 35, new Integer[]{17,12,-3}),
                                                new SGKoefizient(3, 21, new Integer[]{7,6,3,-2}),
                                                new SGKoefizient(4, 231, new Integer[]{59,54,39,14,-21}),
                                                new SGKoefizient(5, 429, new Integer[]{89,84,69,44,9,-36}),
                                                new SGKoefizient(6, 143, new Integer[]{25,24,21,16,9,0,-11}),
                                                new SGKoefizient(7, 1105, new Integer[]{167,162,147,122,87,42,-13,-78}),
                                                new SGKoefizient(8, 323, new Integer[]{43,42,39,34,27,18,7,-6,-21}),
                                                new SGKoefizient(9, 2261, new Integer[]{269,264,249,224,189,144,89,24,-51,-136}),
                                                new SGKoefizient(10, 3059, new Integer[]{329,324,309,284,249,204,149,84,9,-76,-171}),
                                                new SGKoefizient(11, 805, new Integer[]{79,78,75,70,63,54,43,30,15,-2,-21,-42}),
                                                new SGKoefizient(12, 5175, new Integer[]{467,462,447,422,387,343,287,222,147,62,-33,-138,-253}),
                                            };
}

