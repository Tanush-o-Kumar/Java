Create Employee class as root class with attributes: name, PANNo., joiningDate, designation, empId etc. Add abstract method calcCTC().

Create 2 child classes of Employee class: FullTimeEmployee and ContractEmployee. Override calcCTC() in both child classes based on the role. E.g. role=SWE: baseSalary+perfBonus
role=HR:baseSalary+hiringCommision
For Contractemployee: CTC=noOfHrs*HourlyRate

Manager is a full time employee i.e. Manager is a child of FullTimeEmployee
So, calcCTC() for manager = baseSalary+perfBonus+TA+eduAlllowance
