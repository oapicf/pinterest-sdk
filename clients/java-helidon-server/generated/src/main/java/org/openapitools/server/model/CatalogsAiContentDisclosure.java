package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsAiContentDisclosureLabel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * AI content disclosure for a single asset of a catalog item.
 */
public class CatalogsAiContentDisclosure   {

    private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();
    private String url;

    /**
     * Default constructor.
     */
    public CatalogsAiContentDisclosure() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsAiContentDisclosure.
     *
     * @param disclosure Disclosure labels that apply to this asset.
     * @param url URL of the asset. Must match one of image_link, additional_image_link, or video_link.
     */
    public CatalogsAiContentDisclosure(
        List<CatalogsAiContentDisclosureLabel> disclosure, 
        String url
    ) {
        this.disclosure = disclosure;
        this.url = url;
    }



    /**
     * Disclosure labels that apply to this asset.
     * @return disclosure
     */
    public List<CatalogsAiContentDisclosureLabel> getDisclosure() {
        return disclosure;
    }

    public void setDisclosure(List<CatalogsAiContentDisclosureLabel> disclosure) {
        this.disclosure = disclosure;
    }

    /**
     * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsAiContentDisclosure {\n");
        
        sb.append("    disclosure: ").append(toIndentedString(disclosure)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

