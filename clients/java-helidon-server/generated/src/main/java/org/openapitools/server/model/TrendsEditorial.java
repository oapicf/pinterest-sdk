package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeywordInfo;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Information of the published editorial article.
 */
public class TrendsEditorial   {

    private String boardUrl;
    private String description;
    private List<String> interests = new ArrayList<>();
    private List<String> pinsUrl = new ArrayList<>();
    private List<@Valid KeywordInfo> relatedKeywords = new ArrayList<>();
    private String title;

    /**
     * Default constructor.
     */
    public TrendsEditorial() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendsEditorial.
     *
     * @param boardUrl URL of the editorial board
     * @param description Description of the editorial article
     * @param interests List of interests related to the editorial article
     * @param pinsUrl URL of the pins related to the editorial article
     * @param relatedKeywords List of keywords related to the editorial article
     * @param title Title of the editorial article
     */
    public TrendsEditorial(
        String boardUrl, 
        String description, 
        List<String> interests, 
        List<String> pinsUrl, 
        List<@Valid KeywordInfo> relatedKeywords, 
        String title
    ) {
        this.boardUrl = boardUrl;
        this.description = description;
        this.interests = interests;
        this.pinsUrl = pinsUrl;
        this.relatedKeywords = relatedKeywords;
        this.title = title;
    }



    /**
     * URL of the editorial board
     * @return boardUrl
     */
    public String getBoardUrl() {
        return boardUrl;
    }

    public void setBoardUrl(String boardUrl) {
        this.boardUrl = boardUrl;
    }

    /**
     * Description of the editorial article
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * List of interests related to the editorial article
     * @return interests
     */
    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    /**
     * URL of the pins related to the editorial article
     * @return pinsUrl
     */
    public List<String> getPinsUrl() {
        return pinsUrl;
    }

    public void setPinsUrl(List<String> pinsUrl) {
        this.pinsUrl = pinsUrl;
    }

    /**
     * List of keywords related to the editorial article
     * @return relatedKeywords
     */
    public List<@Valid KeywordInfo> getRelatedKeywords() {
        return relatedKeywords;
    }

    public void setRelatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
        this.relatedKeywords = relatedKeywords;
    }

    /**
     * Title of the editorial article
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendsEditorial {\n");
        
        sb.append("    boardUrl: ").append(toIndentedString(boardUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
        sb.append("    pinsUrl: ").append(toIndentedString(pinsUrl)).append("\n");
        sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

