package main.javafiles;



public class Defects {
	
	private String defect_Name;
    private String defect_Description;
    private String defect_Category;
    private String defect_Status;
    private int defect_id;
    
    public int getDefect_Id()
    {
    	return (this.defect_id);
    }
    
    public void setDefect_Id(int defect_id)
    {
    	this.defect_id = defect_id;
    }

    public void setDefect_Name(String defect_Name) 
    { 
    
        this.defect_Name = defect_Name;
        
    }
    public String getDefect_Name() 
    { 
        return (this.defect_Name);
    }
    
        
    public void setdefect_Description(String defect_Description) 
    { 
    
        this.defect_Description = defect_Description;
        
    }
    public String getdefect_Description() 
    { 
        return (this.defect_Description);
        
    }
    
    public void setdefect_Category(String defect_Category) 
    { 
    
        this.defect_Category = defect_Category;
        
    }
    public String getdefect_Category() 
    { 
        return (this.defect_Category);
        
    }
    
    public void setdefect_Status(String defect_Status) 
    { 
    
        this.defect_Status = defect_Status;
        
    }
    public String getdefect_Status() 
    { 
        return (this.defect_Status);
        
    }
    
    @Override
    public String toString(){
    	return "Defects=[defectName = "+defect_Name+",defectCategory = "+defect_Description+",defectName = "+defect_Category+",defectStatus = "+defect_Status+"]"; 
    }
	
}
