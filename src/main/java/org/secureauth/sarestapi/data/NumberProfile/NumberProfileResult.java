package org.secureauth.sarestapi.data.NumberProfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.secureauth.sarestapi.util.JSONUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "providerRequestId",
        "internationalFormat",
        "nationalFormat",
        "countryPrefix",
        "countryCode",
        "countryCodeISO3",
        "country",
        "portedStatus",
        "validNumber",
        "reachable",
        "roamingInfo",
        "currentCarrier",
        "originalCarrier",
        "ipInfo",
        "ipWarning"
})
public class NumberProfileResult {

    @JsonProperty("providerRequestId")
    private String providerRequestId;
    @JsonProperty("internationalFormat")
    private String internationalFormat;
    @JsonProperty("nationalFormat")
    private String nationalFormat;
    @JsonProperty("countryPrefix")
    private String countryPrefix;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("countryCodeISO3")
    private String countryCodeISO3;
    @JsonProperty("country")
    private String country;
    @JsonProperty("portedStatus")
    private String portedStatus;
    @JsonProperty("validNumber")
    private Object validNumber;
    @JsonProperty("reachable")
    private Object reachable;
    @JsonProperty("roamingInfo")
    private Object roamingInfo;
    @JsonProperty("currentCarrier")
    private CurrentCarrier currentCarrier;
    @JsonProperty("originalCarrier")
    private OriginalCarrier originalCarrier;
    @JsonProperty("ipInfo")
    private Object ipInfo;
    @JsonProperty("ipWarning")
    private Object ipWarning;

    /**
     * No args constructor for use in serialization
     *
     */
    public NumberProfileResult() {
    }

    /**
     *
     * @param originalCarrier
     * @param providerRequestId
     * @param portedStatus
     * @param countryCodeISO3
     * @param internationalFormat
     * @param countryCode
     * @param roamingInfo
     * @param validNumber
     * @param nationalFormat
     * @param country
     * @param countryPrefix
     * @param ipWarning
     * @param ipInfo
     * @param reachable
     * @param currentCarrier
     */
    public NumberProfileResult(String providerRequestId, String internationalFormat, String nationalFormat, String countryPrefix, String countryCode, String countryCodeISO3, String country, String portedStatus, Object validNumber, Object reachable, Object roamingInfo, CurrentCarrier currentCarrier, OriginalCarrier originalCarrier, Object ipInfo, Object ipWarning) {
        super();
        this.providerRequestId = providerRequestId;
        this.internationalFormat = internationalFormat;
        this.nationalFormat = nationalFormat;
        this.countryPrefix = countryPrefix;
        this.countryCode = countryCode;
        this.countryCodeISO3 = countryCodeISO3;
        this.country = country;
        this.portedStatus = portedStatus;
        this.validNumber = validNumber;
        this.reachable = reachable;
        this.roamingInfo = roamingInfo;
        this.currentCarrier = currentCarrier;
        this.originalCarrier = originalCarrier;
        this.ipInfo = ipInfo;
        this.ipWarning = ipWarning;
    }

    @JsonProperty("providerRequestId")
    public String getProviderRequestId() {
        return providerRequestId;
    }

    @JsonProperty("providerRequestId")
    public void setProviderRequestId(String providerRequestId) {
        this.providerRequestId = providerRequestId;
    }

    public NumberProfileResult withProviderRequestId(String providerRequestId) {
        this.providerRequestId = providerRequestId;
        return this;
    }

    @JsonProperty("internationalFormat")
    public String getInternationalFormat() {
        return internationalFormat;
    }

    @JsonProperty("internationalFormat")
    public void setInternationalFormat(String internationalFormat) {
        this.internationalFormat = internationalFormat;
    }

    public NumberProfileResult withInternationalFormat(String internationalFormat) {
        this.internationalFormat = internationalFormat;
        return this;
    }

    @JsonProperty("nationalFormat")
    public String getNationalFormat() {
        return nationalFormat;
    }

    @JsonProperty("nationalFormat")
    public void setNationalFormat(String nationalFormat) {
        this.nationalFormat = nationalFormat;
    }

    public NumberProfileResult withNationalFormat(String nationalFormat) {
        this.nationalFormat = nationalFormat;
        return this;
    }

    @JsonProperty("countryPrefix")
    public String getCountryPrefix() {
        return countryPrefix;
    }

    @JsonProperty("countryPrefix")
    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    public NumberProfileResult withCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
        return this;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public NumberProfileResult withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("countryCodeISO3")
    public String getCountryCodeISO3() {
        return countryCodeISO3;
    }

    @JsonProperty("countryCodeISO3")
    public void setCountryCodeISO3(String countryCodeISO3) {
        this.countryCodeISO3 = countryCodeISO3;
    }

    public NumberProfileResult withCountryCodeISO3(String countryCodeISO3) {
        this.countryCodeISO3 = countryCodeISO3;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public NumberProfileResult withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("portedStatus")
    public String getPortedStatus() {
        return portedStatus;
    }

    @JsonProperty("portedStatus")
    public void setPortedStatus(String portedStatus) {
        this.portedStatus = portedStatus;
    }

    public NumberProfileResult withPortedStatus(String portedStatus) {
        this.portedStatus = portedStatus;
        return this;
    }

    @JsonProperty("validNumber")
    public Object getValidNumber() {
        return validNumber;
    }

    @JsonProperty("validNumber")
    public void setValidNumber(Object validNumber) {
        this.validNumber = validNumber;
    }

    public NumberProfileResult withValidNumber(Object validNumber) {
        this.validNumber = validNumber;
        return this;
    }

    @JsonProperty("reachable")
    public Object getReachable() {
        return reachable;
    }

    @JsonProperty("reachable")
    public void setReachable(Object reachable) {
        this.reachable = reachable;
    }

    public NumberProfileResult withReachable(Object reachable) {
        this.reachable = reachable;
        return this;
    }

    @JsonProperty("roamingInfo")
    public Object getRoamingInfo() {
        return roamingInfo;
    }

    @JsonProperty("roamingInfo")
    public void setRoamingInfo(Object roamingInfo) {
        this.roamingInfo = roamingInfo;
    }

    public NumberProfileResult withRoamingInfo(Object roamingInfo) {
        this.roamingInfo = roamingInfo;
        return this;
    }

    @JsonProperty("currentCarrier")
    public CurrentCarrier getCurrentCarrier() {
        return currentCarrier;
    }

    @JsonProperty("currentCarrier")
    public void setCurrentCarrier(CurrentCarrier currentCarrier) {
        this.currentCarrier = currentCarrier;
    }

    public NumberProfileResult withCurrentCarrier(CurrentCarrier currentCarrier) {
        this.currentCarrier = currentCarrier;
        return this;
    }

    @JsonProperty("originalCarrier")
    public OriginalCarrier getOriginalCarrier() {
        return originalCarrier;
    }

    @JsonProperty("originalCarrier")
    public void setOriginalCarrier(OriginalCarrier originalCarrier) {
        this.originalCarrier = originalCarrier;
    }

    public NumberProfileResult withOriginalCarrier(OriginalCarrier originalCarrier) {
        this.originalCarrier = originalCarrier;
        return this;
    }

    @JsonProperty("ipInfo")
    public Object getIpInfo() {
        return ipInfo;
    }

    @JsonProperty("ipInfo")
    public void setIpInfo(Object ipInfo) {
        this.ipInfo = ipInfo;
    }

    public NumberProfileResult withIpInfo(Object ipInfo) {
        this.ipInfo = ipInfo;
        return this;
    }

    @JsonProperty("ipWarning")
    public Object getIpWarning() {
        return ipWarning;
    }

    @JsonProperty("ipWarning")
    public void setIpWarning(Object ipWarning) {
        this.ipWarning = ipWarning;
    }

    public NumberProfileResult withIpWarning(Object ipWarning) {
        this.ipWarning = ipWarning;
        return this;
    }
    @Override
    public String toString(){
        return JSONUtil.convertObjectToJSON(this);
    }
}
