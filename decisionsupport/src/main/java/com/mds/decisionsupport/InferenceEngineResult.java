package com.mds.decisionsupport;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Inference engine Result")
public class InferenceEngineResult  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Description")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String description;
    
    @org.kie.api.definition.type.Description(value = "list of # separated rules that gives this result")
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "matched rules")
    @org.kie.api.definition.type.Position(value = 6)
    private java.lang.String matchedRules;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Medical record")
    @org.kie.api.definition.type.Position(value = 5)
    private com.mds.decisionsupport.MedicalRecord medicalRecord;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "request")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String request;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Result date")
    @org.kie.api.definition.type.Position(value = 4)
    private java.util.Date resultDate;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Suggest of an action")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String suggestOfAnAction;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Value")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String value;

    public InferenceEngineResult() {
    }

    public InferenceEngineResult(java.lang.String value, java.lang.String description, java.lang.String suggestOfAnAction, java.lang.String request, java.util.Date resultDate, com.mds.decisionsupport.MedicalRecord medicalRecord, java.lang.String matchedRules) {
        this.value = value;
        this.description = description;
        this.suggestOfAnAction = suggestOfAnAction;
        this.request = request;
        this.resultDate = resultDate;
        this.medicalRecord = medicalRecord;
        this.matchedRules = matchedRules;
    }


    
    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(  java.lang.String description ) {
        this.description = description;
    }
    
    public java.lang.String getMatchedRules() {
        return this.matchedRules;
    }

    public void setMatchedRules(  java.lang.String matchedRules ) {
        this.matchedRules = matchedRules;
    }
    
    public com.mds.decisionsupport.MedicalRecord getMedicalRecord() {
        return this.medicalRecord;
    }

    public void setMedicalRecord(  com.mds.decisionsupport.MedicalRecord medicalRecord ) {
        this.medicalRecord = medicalRecord;
    }
    
    public java.lang.String getRequest() {
        return this.request;
    }

    public void setRequest(  java.lang.String request ) {
        this.request = request;
    }
    
    public java.util.Date getResultDate() {
        return this.resultDate;
    }

    public void setResultDate(  java.util.Date resultDate ) {
        this.resultDate = resultDate;
    }
    
    public java.lang.String getSuggestOfAnAction() {
        return this.suggestOfAnAction;
    }

    public void setSuggestOfAnAction(  java.lang.String suggestOfAnAction ) {
        this.suggestOfAnAction = suggestOfAnAction;
    }
    
    public java.lang.String getValue() {
        return this.value;
    }

    public void setValue(  java.lang.String value ) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.mds.decisionsupport.InferenceEngineResult that = (com.mds.decisionsupport.InferenceEngineResult)o;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (matchedRules != null ? !matchedRules.equals(that.matchedRules) : that.matchedRules != null) return false;
        if (medicalRecord != null ? !medicalRecord.equals(that.medicalRecord) : that.medicalRecord != null) return false;
        if (request != null ? !request.equals(that.request) : that.request != null) return false;
        if (resultDate != null ? !resultDate.equals(that.resultDate) : that.resultDate != null) return false;
        if (suggestOfAnAction != null ? !suggestOfAnAction.equals(that.suggestOfAnAction) : that.suggestOfAnAction != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 13 * result + (description != null ? description.hashCode() : 0);
        result = 13 * result + (matchedRules != null ? matchedRules.hashCode() : 0);
        result = 13 * result + (medicalRecord != null ? medicalRecord.hashCode() : 0);
        result = 13 * result + (request != null ? request.hashCode() : 0);
        result = 13 * result + (resultDate != null ? resultDate.hashCode() : 0);
        result = 13 * result + (suggestOfAnAction != null ? suggestOfAnAction.hashCode() : 0);
        result = 13 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}