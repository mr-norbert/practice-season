package org.fasttrackit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetirementCalculatorPrinter {


         String currentAgeIn;
         String ageOfRetirementIn;
         RetirementCalculator retirementCalculator;
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        public RetirementCalculatorPrinter(RetirementCalculator retirementCalculator) {
            this.retirementCalculator = retirementCalculator;
        }

        public void provideInputs() throws IOException {
            System.out.println(" What is your current age? ");
            currentAgeIn = input.readLine();
            System.out.println(" At what age would you like to retire? ");
            ageOfRetirementIn = input.readLine();
        }

        public void printRetirementCalculationInfos() {
            int ageOfRetirement;
            int currentAge;
            try {
                ageOfRetirement = Integer.parseInt(ageOfRetirementIn);
                currentAge = Integer.parseInt(currentAgeIn);
            } catch (NumberFormatException ex) {
                System.out.println(" the value entered is not numeric.");
                return;
            }
            if (currentAge < 1 || ageOfRetirement < 1) {
                System.out.println(" your inputs are not valid ");

            } else if (currentAge > ageOfRetirement) {
                System.out.println(" You are already retired! ");
                return;
            }
            System.out.println(retirementCalculator.provideRetirementInfo(currentAge, ageOfRetirement));
        }
    }
