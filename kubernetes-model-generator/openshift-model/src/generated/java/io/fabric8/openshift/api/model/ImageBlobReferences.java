
package io.fabric8.openshift.api.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "config",
    "imageMissing",
    "layers",
    "manifests"
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
public class ImageBlobReferences implements Editable<ImageBlobReferencesBuilder> , KubernetesResource
{

    @JsonProperty("config")
    private String config;
    @JsonProperty("imageMissing")
    private Boolean imageMissing;
    @JsonProperty("layers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> layers = new ArrayList<>();
    @JsonProperty("manifests")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> manifests = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageBlobReferences() {
    }

    public ImageBlobReferences(String config, Boolean imageMissing, List<String> layers, List<String> manifests) {
        super();
        this.config = config;
        this.imageMissing = imageMissing;
        this.layers = layers;
        this.manifests = manifests;
    }

    @JsonProperty("config")
    public String getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(String config) {
        this.config = config;
    }

    @JsonProperty("imageMissing")
    public Boolean getImageMissing() {
        return imageMissing;
    }

    @JsonProperty("imageMissing")
    public void setImageMissing(Boolean imageMissing) {
        this.imageMissing = imageMissing;
    }

    @JsonProperty("layers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getLayers() {
        return layers;
    }

    @JsonProperty("layers")
    public void setLayers(List<String> layers) {
        this.layers = layers;
    }

    @JsonProperty("manifests")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getManifests() {
        return manifests;
    }

    @JsonProperty("manifests")
    public void setManifests(List<String> manifests) {
        this.manifests = manifests;
    }

    @JsonIgnore
    public ImageBlobReferencesBuilder edit() {
        return new ImageBlobReferencesBuilder(this);
    }

    @JsonIgnore
    public ImageBlobReferencesBuilder toBuilder() {
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