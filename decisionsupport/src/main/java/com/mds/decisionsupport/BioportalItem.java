package com.mds.decisionsupport;


/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Bioportal Item")
public class BioportalItem  implements java.io.Serializable {

static final long serialVersionUID = 1L;
	
	
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "@context")
    @org.kie.api.definition.type.Position(value = 7)
    private com.mds.decisionsupport.BioportalContext context;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Definition")
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.List<java.lang.String> definition;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "@id")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String id;
    
    @org.kie.api.definition.type.Label(value = "is Bioportal Term")
    @org.kie.api.definition.type.Position(value = 8)
    private java.lang.Boolean isBioportalTerm;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Links")
    @org.kie.api.definition.type.Position(value = 6)
    private com.mds.decisionsupport.BioportalLinks links;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Obsolete")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Boolean obsolete;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Pref label")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String prefLabel;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "synonym")
    @org.kie.api.definition.type.Position(value = 1)
    private java.util.List<java.lang.String> synonym;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "@type")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String type;

    public BioportalItem() {
    	System.out.println("new item have ben instanciated");
    }

    public BioportalItem(java.lang.String prefLabel, java.util.List<java.lang.String> synonym, java.util.List<java.lang.String> definition, java.lang.Boolean obsolete, java.lang.String id, java.lang.String type, com.mds.decisionsupport.BioportalLinks links, com.mds.decisionsupport.BioportalContext context, java.lang.Boolean isBioportalTerm) {
        this.prefLabel = prefLabel;
        this.synonym = synonym;
        this.definition = definition;
        this.obsolete = obsolete;
        this.id = id;
        this.type = type;
        this.links = links;
        this.context = context;
        this.isBioportalTerm = isBioportalTerm;
        System.out.println("new item have ben instanciated : "+prefLabel);
    }

    public BioportalItem(java.lang.String prefLabel, java.util.List<java.lang.String> synonym, java.util.List<java.lang.String> definition, java.lang.Boolean obsolete, java.lang.String id, java.lang.String type, com.mds.decisionsupport.BioportalLinks links, com.mds.decisionsupport.BioportalContext context) {
        this.prefLabel = prefLabel;
        this.synonym = synonym;
        this.definition = definition;
        this.obsolete = obsolete;
        this.id = id;
        this.type = type;
        this.links = links;
        this.context = context;
        System.out.println("new item have ben instanciated"+prefLabel);
    }
    
    public com.mds.decisionsupport.BioportalContext getContext() {
        return this.context;
    }

    public void setContext(  com.mds.decisionsupport.BioportalContext context ) {
        this.context = context;
    }
    
    public java.util.List<java.lang.String> getDefinition() {
        return this.definition;
    }

    public void setDefinition(  java.util.List<java.lang.String> definition ) {
        this.definition = definition;
    }
    public void addDefinition(  java.lang.String definition ) {
    	if(this.definition == null){
    		this.definition = new  java.util.ArrayList<java.lang.String>();    	
    	}
        this.definition.add(definition);
    }
    public java.lang.String getId() {
        return this.id;
    }

    public void setId(  java.lang.String id ) {
        this.id = id;
    }
    
    public java.lang.Boolean getIsBioportalTerm() {
        return this.isBioportalTerm;
    }

    public void setIsBioportalTerm(  java.lang.Boolean isBioportalTerm ) {
        this.isBioportalTerm = isBioportalTerm;
    }
    
    public com.mds.decisionsupport.BioportalLinks getLinks() {
        return this.links;
    }

    public void setLinks(  com.mds.decisionsupport.BioportalLinks links ) {
        this.links = links;
    }
    
    public java.lang.Boolean getObsolete() {
        return this.obsolete;
    }

    public void setObsolete(  java.lang.Boolean obsolete ) {
        this.obsolete = obsolete;
    }
    
    public java.lang.String getPrefLabel() {
        return this.prefLabel;
    }

    public void setPrefLabel(  java.lang.String prefLabel ) {
        this.prefLabel = prefLabel;
    }
    
    public java.util.List<java.lang.String> getSynonym() {
        return this.synonym;
    }

    public void setSynonym(  java.util.List<java.lang.String> synonym ) {
        this.synonym = synonym;
    }
    public void addSynonym(  java.lang.String  synonym ) {
    	if(this.synonym == null){
    	this.synonym = new 	java.util.ArrayList<java.lang.String>(); 
    	}
        this.synonym.add(synonym);
    }
    public java.lang.String getType() {
        return this.type;
    }

    public void setType(  java.lang.String type ) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.mds.decisionsupport.BioportalItem that = (com.mds.decisionsupport.BioportalItem)o;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (definition != null ? !definition.equals(that.definition) : that.definition != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (links != null ? !links.equals(that.links) : that.links != null) return false;
        if (obsolete != null ? !obsolete.equals(that.obsolete) : that.obsolete != null) return false;
        if (prefLabel != null ? !prefLabel.equals(that.prefLabel) : that.prefLabel != null) return false;
        if (synonym != null ? !synonym.equals(that.synonym) : that.synonym != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 13 * result + (context != null ? context.hashCode() : 0);
        result = 13 * result + (definition != null ? definition.hashCode() : 0);
        result = 13 * result + (id != null ? id.hashCode() : 0);
        result = 13 * result + (links != null ? links.hashCode() : 0);
        result = 13 * result + (obsolete != null ? obsolete.hashCode() : 0);
        result = 13 * result + (prefLabel != null ? prefLabel.hashCode() : 0);
        result = 13 * result + (synonym != null ? synonym.hashCode() : 0);
        result = 13 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}