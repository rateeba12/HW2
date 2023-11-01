package Reports;

import Reports.Interfaces.ReportsTemplate;

public class ReportFactory {
    public ReportsTemplate createReport (String report){
        if(report == null || report.isEmpty()){
            return null;
        }
        switch (report){
            case "staff for manager":
                return new StaffReportManager();
            case "staff for director":
                return  new StaffReportDirector();
            case "budget for manager" :
                return new budgetReportManager();
            case "budget for director" :
                return new budgetReportsDirector();
        }


        return null;
    }
}
