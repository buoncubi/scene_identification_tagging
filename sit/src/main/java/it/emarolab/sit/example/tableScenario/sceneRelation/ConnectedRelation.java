package it.emarolab.sit.example.tableScenario.sceneRelation;

import it.emarolab.amor.owlInterface.OWLReferences;
import it.emarolab.sit.core.ElementInterface;
import it.emarolab.sit.core.RelationInterface;
import it.emarolab.sit.example.tableScenario.sceneElement.SpatialObject;

/**
 * ...
 * <p>
 * ...
 * <p>
 * <div style="text-align:center;"><small>
 * <b>File</b>:        ${FILE} <br>
 * <b>Licence</b>:     GNU GENERAL PUBLIC LICENSE. Version 3, 29 June 2007 <br>
 * <b>Author</b>:      Buoncompagni Luca (luca.buoncompagni@edu.unige.it) <br>
 * <b>affiliation</b>: DIBRIS, EMAROLab, University of Genoa. <br>
 * <b>date</b>:        20/07/19 <br>
 * </small></div>
 */
public class ConnectedRelation implements RelationInterface {

    private SpatialObject domain, range;
    private String relation;
    private OWLReferences ontology;

    public ConnectedRelation(SpatialObject domain, String relation, SpatialObject range, OWLReferences ontology){
        this.ontology = ontology;
        this.relation = relation;
        this.domain = domain;
        this.range = range;
    }

    @Override
    public ElementInterface getDomainElement() {
        return domain;
    }

    @Override
    public ElementInterface getRangeElement() {
        return range;
    }

    @Override
    public String getRelationName() {
        return relation;
    }

    @Override
    public OWLReferences getOntology() {
        return ontology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectedRelation)) return false;

        ConnectedRelation that = (ConnectedRelation) o;

        if (getDomain() != null ? !getDomain().equals(that.getDomain()) : that.getDomain() != null) return false;
        if (getRelation() != null ? !getRelation().equals(that.getRelation()) : that.getRelation() != null)
            return false;
        return getRange() != null ? getRange().equals(that.getRange()) : that.getRange() == null;
    }

    @Override
    public int hashCode() {
        int result = getDomain() != null ? getDomain().hashCode() : 0;
        result = 31 * result + (getRelation() != null ? getRelation().hashCode() : 0);
        result = 31 * result + (getRange() != null ? getRange().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return relation + "(" + domain.getInstanceName() + "," + range.getInstanceName() +")";
    }
}
