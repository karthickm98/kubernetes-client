
package io.fabric8.openshift.api.model.machineconfiguration.v1;

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
    "additionalTrustBundle",
    "baseOSContainerImage",
    "baseOSExtensionsContainerImage",
    "cloudProviderCAData",
    "cloudProviderConfig",
    "clusterDNSIP",
    "dns",
    "etcdDiscoveryDomain",
    "imageRegistryBundleData",
    "imageRegistryBundleUserData",
    "images",
    "infra",
    "internalRegistryPullSecret",
    "ipFamilies",
    "kubeAPIServerServingCAData",
    "network",
    "networkType",
    "osImageURL",
    "platform",
    "proxy",
    "pullSecret",
    "releaseImage",
    "rootCAData"
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
public class ControllerConfigSpec implements Editable<ControllerConfigSpecBuilder> , KubernetesResource
{

    @JsonProperty("additionalTrustBundle")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object additionalTrustBundle;
    @JsonProperty("baseOSContainerImage")
    private String baseOSContainerImage;
    @JsonProperty("baseOSExtensionsContainerImage")
    private String baseOSExtensionsContainerImage;
    @JsonProperty("cloudProviderCAData")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object cloudProviderCAData;
    @JsonProperty("cloudProviderConfig")
    private String cloudProviderConfig;
    @JsonProperty("clusterDNSIP")
    private String clusterDNSIP;
    @JsonProperty("dns")
    private ControllerConfigSpecDns dns;
    @JsonProperty("etcdDiscoveryDomain")
    private String etcdDiscoveryDomain;
    @JsonProperty("imageRegistryBundleData")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ControllerConfigSpecImageRegistryBundleData> imageRegistryBundleData = new ArrayList<>();
    @JsonProperty("imageRegistryBundleUserData")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ControllerConfigSpecImageRegistryBundleUserData> imageRegistryBundleUserData = new ArrayList<>();
    @JsonProperty("images")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> images = new LinkedHashMap<>();
    @JsonProperty("infra")
    private ControllerConfigSpecInfra infra;
    @JsonProperty("internalRegistryPullSecret")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object internalRegistryPullSecret;
    @JsonProperty("ipFamilies")
    private String ipFamilies;
    @JsonProperty("kubeAPIServerServingCAData")
    private String kubeAPIServerServingCAData;
    @JsonProperty("network")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object network;
    @JsonProperty("networkType")
    private String networkType;
    @JsonProperty("osImageURL")
    private String osImageURL;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("proxy")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object proxy;
    @JsonProperty("pullSecret")
    private ControllerConfigSpecPullSecret pullSecret;
    @JsonProperty("releaseImage")
    private String releaseImage;
    @JsonProperty("rootCAData")
    private String rootCAData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ControllerConfigSpec() {
    }

    public ControllerConfigSpec(Object additionalTrustBundle, String baseOSContainerImage, String baseOSExtensionsContainerImage, Object cloudProviderCAData, String cloudProviderConfig, String clusterDNSIP, ControllerConfigSpecDns dns, String etcdDiscoveryDomain, List<ControllerConfigSpecImageRegistryBundleData> imageRegistryBundleData, List<ControllerConfigSpecImageRegistryBundleUserData> imageRegistryBundleUserData, Map<String, String> images, ControllerConfigSpecInfra infra, Object internalRegistryPullSecret, String ipFamilies, String kubeAPIServerServingCAData, Object network, String networkType, String osImageURL, String platform, Object proxy, ControllerConfigSpecPullSecret pullSecret, String releaseImage, String rootCAData) {
        super();
        this.additionalTrustBundle = additionalTrustBundle;
        this.baseOSContainerImage = baseOSContainerImage;
        this.baseOSExtensionsContainerImage = baseOSExtensionsContainerImage;
        this.cloudProviderCAData = cloudProviderCAData;
        this.cloudProviderConfig = cloudProviderConfig;
        this.clusterDNSIP = clusterDNSIP;
        this.dns = dns;
        this.etcdDiscoveryDomain = etcdDiscoveryDomain;
        this.imageRegistryBundleData = imageRegistryBundleData;
        this.imageRegistryBundleUserData = imageRegistryBundleUserData;
        this.images = images;
        this.infra = infra;
        this.internalRegistryPullSecret = internalRegistryPullSecret;
        this.ipFamilies = ipFamilies;
        this.kubeAPIServerServingCAData = kubeAPIServerServingCAData;
        this.network = network;
        this.networkType = networkType;
        this.osImageURL = osImageURL;
        this.platform = platform;
        this.proxy = proxy;
        this.pullSecret = pullSecret;
        this.releaseImage = releaseImage;
        this.rootCAData = rootCAData;
    }

    @JsonProperty("additionalTrustBundle")
    public Object getAdditionalTrustBundle() {
        return additionalTrustBundle;
    }

    @JsonProperty("additionalTrustBundle")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setAdditionalTrustBundle(Object additionalTrustBundle) {
        this.additionalTrustBundle = additionalTrustBundle;
    }

    @JsonProperty("baseOSContainerImage")
    public String getBaseOSContainerImage() {
        return baseOSContainerImage;
    }

    @JsonProperty("baseOSContainerImage")
    public void setBaseOSContainerImage(String baseOSContainerImage) {
        this.baseOSContainerImage = baseOSContainerImage;
    }

    @JsonProperty("baseOSExtensionsContainerImage")
    public String getBaseOSExtensionsContainerImage() {
        return baseOSExtensionsContainerImage;
    }

    @JsonProperty("baseOSExtensionsContainerImage")
    public void setBaseOSExtensionsContainerImage(String baseOSExtensionsContainerImage) {
        this.baseOSExtensionsContainerImage = baseOSExtensionsContainerImage;
    }

    @JsonProperty("cloudProviderCAData")
    public Object getCloudProviderCAData() {
        return cloudProviderCAData;
    }

    @JsonProperty("cloudProviderCAData")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setCloudProviderCAData(Object cloudProviderCAData) {
        this.cloudProviderCAData = cloudProviderCAData;
    }

    @JsonProperty("cloudProviderConfig")
    public String getCloudProviderConfig() {
        return cloudProviderConfig;
    }

    @JsonProperty("cloudProviderConfig")
    public void setCloudProviderConfig(String cloudProviderConfig) {
        this.cloudProviderConfig = cloudProviderConfig;
    }

    @JsonProperty("clusterDNSIP")
    public String getClusterDNSIP() {
        return clusterDNSIP;
    }

    @JsonProperty("clusterDNSIP")
    public void setClusterDNSIP(String clusterDNSIP) {
        this.clusterDNSIP = clusterDNSIP;
    }

    @JsonProperty("dns")
    public ControllerConfigSpecDns getDns() {
        return dns;
    }

    @JsonProperty("dns")
    public void setDns(ControllerConfigSpecDns dns) {
        this.dns = dns;
    }

    @JsonProperty("etcdDiscoveryDomain")
    public String getEtcdDiscoveryDomain() {
        return etcdDiscoveryDomain;
    }

    @JsonProperty("etcdDiscoveryDomain")
    public void setEtcdDiscoveryDomain(String etcdDiscoveryDomain) {
        this.etcdDiscoveryDomain = etcdDiscoveryDomain;
    }

    @JsonProperty("imageRegistryBundleData")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<ControllerConfigSpecImageRegistryBundleData> getImageRegistryBundleData() {
        return imageRegistryBundleData;
    }

    @JsonProperty("imageRegistryBundleData")
    public void setImageRegistryBundleData(List<ControllerConfigSpecImageRegistryBundleData> imageRegistryBundleData) {
        this.imageRegistryBundleData = imageRegistryBundleData;
    }

    @JsonProperty("imageRegistryBundleUserData")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<ControllerConfigSpecImageRegistryBundleUserData> getImageRegistryBundleUserData() {
        return imageRegistryBundleUserData;
    }

    @JsonProperty("imageRegistryBundleUserData")
    public void setImageRegistryBundleUserData(List<ControllerConfigSpecImageRegistryBundleUserData> imageRegistryBundleUserData) {
        this.imageRegistryBundleUserData = imageRegistryBundleUserData;
    }

    @JsonProperty("images")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, String> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Map<String, String> images) {
        this.images = images;
    }

    @JsonProperty("infra")
    public ControllerConfigSpecInfra getInfra() {
        return infra;
    }

    @JsonProperty("infra")
    public void setInfra(ControllerConfigSpecInfra infra) {
        this.infra = infra;
    }

    @JsonProperty("internalRegistryPullSecret")
    public Object getInternalRegistryPullSecret() {
        return internalRegistryPullSecret;
    }

    @JsonProperty("internalRegistryPullSecret")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setInternalRegistryPullSecret(Object internalRegistryPullSecret) {
        this.internalRegistryPullSecret = internalRegistryPullSecret;
    }

    @JsonProperty("ipFamilies")
    public String getIpFamilies() {
        return ipFamilies;
    }

    @JsonProperty("ipFamilies")
    public void setIpFamilies(String ipFamilies) {
        this.ipFamilies = ipFamilies;
    }

    @JsonProperty("kubeAPIServerServingCAData")
    public String getKubeAPIServerServingCAData() {
        return kubeAPIServerServingCAData;
    }

    @JsonProperty("kubeAPIServerServingCAData")
    public void setKubeAPIServerServingCAData(String kubeAPIServerServingCAData) {
        this.kubeAPIServerServingCAData = kubeAPIServerServingCAData;
    }

    @JsonProperty("network")
    public Object getNetwork() {
        return network;
    }

    @JsonProperty("network")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setNetwork(Object network) {
        this.network = network;
    }

    @JsonProperty("networkType")
    public String getNetworkType() {
        return networkType;
    }

    @JsonProperty("networkType")
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    @JsonProperty("osImageURL")
    public String getOsImageURL() {
        return osImageURL;
    }

    @JsonProperty("osImageURL")
    public void setOsImageURL(String osImageURL) {
        this.osImageURL = osImageURL;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("proxy")
    public Object getProxy() {
        return proxy;
    }

    @JsonProperty("proxy")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setProxy(Object proxy) {
        this.proxy = proxy;
    }

    @JsonProperty("pullSecret")
    public ControllerConfigSpecPullSecret getPullSecret() {
        return pullSecret;
    }

    @JsonProperty("pullSecret")
    public void setPullSecret(ControllerConfigSpecPullSecret pullSecret) {
        this.pullSecret = pullSecret;
    }

    @JsonProperty("releaseImage")
    public String getReleaseImage() {
        return releaseImage;
    }

    @JsonProperty("releaseImage")
    public void setReleaseImage(String releaseImage) {
        this.releaseImage = releaseImage;
    }

    @JsonProperty("rootCAData")
    public String getRootCAData() {
        return rootCAData;
    }

    @JsonProperty("rootCAData")
    public void setRootCAData(String rootCAData) {
        this.rootCAData = rootCAData;
    }

    @JsonIgnore
    public ControllerConfigSpecBuilder edit() {
        return new ControllerConfigSpecBuilder(this);
    }

    @JsonIgnore
    public ControllerConfigSpecBuilder toBuilder() {
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