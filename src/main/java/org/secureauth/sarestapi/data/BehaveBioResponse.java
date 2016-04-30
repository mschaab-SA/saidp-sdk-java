package org.secureauth.sarestapi.data;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by rrowcliffe on 4/30/16.
 */
@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BehaveBioResponse {

    private BehaveBioResults behaveBioResults;
    private String status;
    private String message;

    public BehaveBioResults getBehaveBioResults() {
        return behaveBioResults;
    }

    public void setBehaveBioResults(BehaveBioResults behaveBioResults) {
        this.behaveBioResults = behaveBioResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
