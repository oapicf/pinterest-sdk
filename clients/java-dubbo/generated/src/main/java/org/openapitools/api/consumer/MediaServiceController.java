package org.openapitools.api.consumer;

import org.openapitools.model.Media;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.MediaService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/media")
public class MediaServiceController {

    @DubboReference
    private MediaService mediaService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public MediaUpload mediaCreate(
        @RequestParam(name = "mediaUploadCreate") MediaUploadCreate mediaUploadCreate
    ) {
        return mediaService.mediaCreate(mediaUploadCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{media_id}")
    public Media mediaGet(
        @RequestParam(name = "mediaId") String mediaId
    ) {
        return mediaService.mediaGet(mediaId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public MediaList200Response mediaList(
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return mediaService.mediaList(bookmark, pageSize);
    }
}
