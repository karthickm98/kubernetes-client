
package io.fabric8.openclustermanagement.api.model.discovery.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "activityTimestamp",
    "apiUrl",
    "cloudProvider",
    "console",
    "creationTimestamp",
    "credential",
    "displayName",
    "importAsManagedCluster",
    "isManagedCluster",
    "name",
    "ocpClusterId",
    "openshiftVersion",
    "owner",
    "region",
    "rhocmClusterId",
    "status",
    "type"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("jsonschema2pojo")
public class DiscoveredClusterSpec implements Editable<DiscoveredClusterSpecBuilder> , KubernetesResource
{

    @JsonProperty("activityTimestamp")
    private String activityTimestamp;
    @JsonProperty("apiUrl")
    private String apiUrl;
    @JsonProperty("cloudProvider")
    private String cloudProvider;
    @JsonProperty("console")
    private String console;
    @JsonProperty("creationTimestamp")
    private String creationTimestamp;
    @JsonProperty("credential")
    private ObjectReference credential;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("importAsManagedCluster")
    private Boolean importAsManagedCluster;
    @JsonProperty("isManagedCluster")
    private Boolean isManagedCluster;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ocpClusterId")
    private String ocpClusterId;
    @JsonProperty("openshiftVersion")
    private String openshiftVersion;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("region")
    private String region;
    @JsonProperty("rhocmClusterId")
    private String rhocmClusterId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoveredClusterSpec() {
    }

    public DiscoveredClusterSpec(String activityTimestamp, String apiUrl, String cloudProvider, String console, String creationTimestamp, ObjectReference credential, String displayName, Boolean importAsManagedCluster, Boolean isManagedCluster, String name, String ocpClusterId, String openshiftVersion, String owner, String region, String rhocmClusterId, String status, String type) {
        super();
        this.activityTimestamp = activityTimestamp;
        this.apiUrl = apiUrl;
        this.cloudProvider = cloudProvider;
        this.console = console;
        this.creationTimestamp = creationTimestamp;
        this.credential = credential;
        this.displayName = displayName;
        this.importAsManagedCluster = importAsManagedCluster;
        this.isManagedCluster = isManagedCluster;
        this.name = name;
        this.ocpClusterId = ocpClusterId;
        this.openshiftVersion = openshiftVersion;
        this.owner = owner;
        this.region = region;
        this.rhocmClusterId = rhocmClusterId;
        this.status = status;
        this.type = type;
    }

    @JsonProperty("activityTimestamp")
    public String getActivityTimestamp() {
        return activityTimestamp;
    }

    @JsonProperty("activityTimestamp")
    public void setActivityTimestamp(String activityTimestamp) {
        this.activityTimestamp = activityTimestamp;
    }

    @JsonProperty("apiUrl")
    public String getApiUrl() {
        return apiUrl;
    }

    @JsonProperty("apiUrl")
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @JsonProperty("cloudProvider")
    public String getCloudProvider() {
        return cloudProvider;
    }

    @JsonProperty("cloudProvider")
    public void setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

    @JsonProperty("console")
    public String getConsole() {
        return console;
    }

    @JsonProperty("console")
    public void setConsole(String console) {
        this.console = console;
    }

    @JsonProperty("creationTimestamp")
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    @JsonProperty("creationTimestamp")
    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @JsonProperty("credential")
    public ObjectReference getCredential() {
        return credential;
    }

    @JsonProperty("credential")
    public void setCredential(ObjectReference credential) {
        this.credential = credential;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("importAsManagedCluster")
    public Boolean getImportAsManagedCluster() {
        return importAsManagedCluster;
    }

    @JsonProperty("importAsManagedCluster")
    public void setImportAsManagedCluster(Boolean importAsManagedCluster) {
        this.importAsManagedCluster = importAsManagedCluster;
    }

    @JsonProperty("isManagedCluster")
    public Boolean getIsManagedCluster() {
        return isManagedCluster;
    }

    @JsonProperty("isManagedCluster")
    public void setIsManagedCluster(Boolean isManagedCluster) {
        this.isManagedCluster = isManagedCluster;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ocpClusterId")
    public String getOcpClusterId() {
        return ocpClusterId;
    }

    @JsonProperty("ocpClusterId")
    public void setOcpClusterId(String ocpClusterId) {
        this.ocpClusterId = ocpClusterId;
    }

    @JsonProperty("openshiftVersion")
    public String getOpenshiftVersion() {
        return openshiftVersion;
    }

    @JsonProperty("openshiftVersion")
    public void setOpenshiftVersion(String openshiftVersion) {
        this.openshiftVersion = openshiftVersion;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("rhocmClusterId")
    public String getRhocmClusterId() {
        return rhocmClusterId;
    }

    @JsonProperty("rhocmClusterId")
    public void setRhocmClusterId(String rhocmClusterId) {
        this.rhocmClusterId = rhocmClusterId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonIgnore
    public DiscoveredClusterSpecBuilder edit() {
        return new DiscoveredClusterSpecBuilder(this);
    }

    @JsonIgnore
    public DiscoveredClusterSpecBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}