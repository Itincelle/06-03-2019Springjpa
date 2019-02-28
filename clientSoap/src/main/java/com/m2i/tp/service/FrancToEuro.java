
package com.m2i.tp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour francToEuro complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="francToEuro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montantFranc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "francToEuro", propOrder = {
    "montantFranc"
})
public class FrancToEuro {

    protected double montantFranc;

    /**
     * Obtient la valeur de la propri�t� montantFranc.
     * 
     */
    public double getMontantFranc() {
        return montantFranc;
    }

    /**
     * D�finit la valeur de la propri�t� montantFranc.
     * 
     */
    public void setMontantFranc(double value) {
        this.montantFranc = value;
    }

}
