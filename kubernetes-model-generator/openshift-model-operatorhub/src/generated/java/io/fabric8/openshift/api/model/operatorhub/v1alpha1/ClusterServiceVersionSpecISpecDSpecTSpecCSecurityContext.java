
package io.fabric8.openshift.api.model.operatorhub.v1alpha1;

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
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowPrivilegeEscalation",
    "appArmorProfile",
    "capabilities",
    "privileged",
    "procMount",
    "readOnlyRootFilesystem",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "seccompProfile",
    "windowsOptions"
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
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContext implements Editable<ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContextBuilder> , KubernetesResource
{

    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;
    @JsonProperty("appArmorProfile")
    private ClusterServiceVersionSpecISpecDSpecTSpecCSCAppArmorProfile appArmorProfile;
    @JsonProperty("capabilities")
    private ClusterServiceVersionSpecISpecDSpecTSpecCSCCapabilities capabilities;
    @JsonProperty("privileged")
    private Boolean privileged;
    @JsonProperty("procMount")
    private String procMount;
    @JsonProperty("readOnlyRootFilesystem")
    private Boolean readOnlyRootFilesystem;
    @JsonProperty("runAsGroup")
    private Long runAsGroup;
    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;
    @JsonProperty("runAsUser")
    private Long runAsUser;
    @JsonProperty("seLinuxOptions")
    private ClusterServiceVersionSpecISpecDSpecTSpecCSCSeLinuxOptions seLinuxOptions;
    @JsonProperty("seccompProfile")
    private ClusterServiceVersionSpecISpecDSpecTSpecCSCSeccompProfile seccompProfile;
    @JsonProperty("windowsOptions")
    private ClusterServiceVersionSpecISpecDSpecTSpecCSCWindowsOptions windowsOptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContext() {
    }

    public ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContext(Boolean allowPrivilegeEscalation, ClusterServiceVersionSpecISpecDSpecTSpecCSCAppArmorProfile appArmorProfile, ClusterServiceVersionSpecISpecDSpecTSpecCSCCapabilities capabilities, Boolean privileged, String procMount, Boolean readOnlyRootFilesystem, Long runAsGroup, Boolean runAsNonRoot, Long runAsUser, ClusterServiceVersionSpecISpecDSpecTSpecCSCSeLinuxOptions seLinuxOptions, ClusterServiceVersionSpecISpecDSpecTSpecCSCSeccompProfile seccompProfile, ClusterServiceVersionSpecISpecDSpecTSpecCSCWindowsOptions windowsOptions) {
        super();
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.appArmorProfile = appArmorProfile;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.windowsOptions = windowsOptions;
    }

    @JsonProperty("allowPrivilegeEscalation")
    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    @JsonProperty("allowPrivilegeEscalation")
    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    @JsonProperty("appArmorProfile")
    public ClusterServiceVersionSpecISpecDSpecTSpecCSCAppArmorProfile getAppArmorProfile() {
        return appArmorProfile;
    }

    @JsonProperty("appArmorProfile")
    public void setAppArmorProfile(ClusterServiceVersionSpecISpecDSpecTSpecCSCAppArmorProfile appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    @JsonProperty("capabilities")
    public ClusterServiceVersionSpecISpecDSpecTSpecCSCCapabilities getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(ClusterServiceVersionSpecISpecDSpecTSpecCSCCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    @JsonProperty("privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    @JsonProperty("privileged")
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    @JsonProperty("procMount")
    public String getProcMount() {
        return procMount;
    }

    @JsonProperty("procMount")
    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    @JsonProperty("readOnlyRootFilesystem")
    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    @JsonProperty("readOnlyRootFilesystem")
    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    @JsonProperty("runAsGroup")
    public Long getRunAsGroup() {
        return runAsGroup;
    }

    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    @JsonProperty("runAsUser")
    public Long getRunAsUser() {
        return runAsUser;
    }

    @JsonProperty("runAsUser")
    public void setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
    }

    @JsonProperty("seLinuxOptions")
    public ClusterServiceVersionSpecISpecDSpecTSpecCSCSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(ClusterServiceVersionSpecISpecDSpecTSpecCSCSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @JsonProperty("seccompProfile")
    public ClusterServiceVersionSpecISpecDSpecTSpecCSCSeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    @JsonProperty("seccompProfile")
    public void setSeccompProfile(ClusterServiceVersionSpecISpecDSpecTSpecCSCSeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    @JsonProperty("windowsOptions")
    public ClusterServiceVersionSpecISpecDSpecTSpecCSCWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    @JsonProperty("windowsOptions")
    public void setWindowsOptions(ClusterServiceVersionSpecISpecDSpecTSpecCSCWindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

    @JsonIgnore
    public ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContextBuilder edit() {
        return new ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContextBuilder(this);
    }

    @JsonIgnore
    public ClusterServiceVersionSpecISpecDSpecTSpecCSecurityContextBuilder toBuilder() {
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