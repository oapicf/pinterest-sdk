#' Create a new AdPreviewShopping
#'
#' @description
#' AdPreviewShopping Class
#'
#' @docType class
#' @title AdPreviewShopping
#' @description AdPreviewShopping Class
#' @format An \code{R6Class} generator object
#' @field catalog_product_group_id Catalog Product Group Id. character
#' @field creative_type Ad format of the shopping ad preview. character
#' @field customizable_cta_type Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` \link{CustomizableCTAType} [optional]
#' @field hero_image_title Title displayed below ad. character [optional]
#' @field hero_image_url Hero image URL. character [optional]
#' @field hero_pin_id Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. character [optional]
#' @field image_tag Multi image template tag. character [optional]
#' @field item_id Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. character [optional]
#' @field preferred_media_type Preferred media type. character [optional]
#' @field video_tag Multi video template tag, image_tag and video_tag are mutual exclusive. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPreviewShopping <- R6::R6Class(
  "AdPreviewShopping",
  public = list(
    `catalog_product_group_id` = NULL,
    `creative_type` = NULL,
    `customizable_cta_type` = NULL,
    `hero_image_title` = NULL,
    `hero_image_url` = NULL,
    `hero_pin_id` = NULL,
    `image_tag` = NULL,
    `item_id` = NULL,
    `preferred_media_type` = NULL,
    `video_tag` = NULL,

    #' @description
    #' Initialize a new AdPreviewShopping class.
    #'
    #' @param catalog_product_group_id Catalog Product Group Id.
    #' @param creative_type Ad format of the shopping ad preview.
    #' @param customizable_cta_type Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
    #' @param hero_image_title Title displayed below ad.
    #' @param hero_image_url Hero image URL.
    #' @param hero_pin_id Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
    #' @param image_tag Multi image template tag.
    #' @param item_id Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
    #' @param preferred_media_type Preferred media type.
    #' @param video_tag Multi video template tag, image_tag and video_tag are mutual exclusive.
    #' @param ... Other optional arguments.
    initialize = function(`catalog_product_group_id`, `creative_type`, `customizable_cta_type` = NULL, `hero_image_title` = NULL, `hero_image_url` = NULL, `hero_pin_id` = NULL, `image_tag` = NULL, `item_id` = NULL, `preferred_media_type` = NULL, `video_tag` = NULL, ...) {
      if (!missing(`catalog_product_group_id`)) {
        if (!(is.character(`catalog_product_group_id`) && length(`catalog_product_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_product_group_id`. Must be a string:", `catalog_product_group_id`))
        }
        self$`catalog_product_group_id` <- `catalog_product_group_id`
      }
      if (!missing(`creative_type`)) {
        if (!(`creative_type` %in% c("SHOPPING", "CAROUSEL", "COLLECTION", "REGULAR"))) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be \"SHOPPING\", \"CAROUSEL\", \"COLLECTION\", \"REGULAR\".", sep = ""))
        }
        if (!(is.character(`creative_type`) && length(`creative_type`) == 1)) {
          stop(paste("Error! Invalid data for `creative_type`. Must be a string:", `creative_type`))
        }
        self$`creative_type` <- `creative_type`
      }
      if (!is.null(`customizable_cta_type`)) {
        if (!(`customizable_cta_type` %in% c())) {
          stop(paste("Error! \"", `customizable_cta_type`, "\" cannot be assigned to `customizable_cta_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`customizable_cta_type`))
        self$`customizable_cta_type` <- `customizable_cta_type`
      }
      if (!is.null(`hero_image_title`)) {
        if (!(is.character(`hero_image_title`) && length(`hero_image_title`) == 1)) {
          stop(paste("Error! Invalid data for `hero_image_title`. Must be a string:", `hero_image_title`))
        }
        self$`hero_image_title` <- `hero_image_title`
      }
      if (!is.null(`hero_image_url`)) {
        if (!(is.character(`hero_image_url`) && length(`hero_image_url`) == 1)) {
          stop(paste("Error! Invalid data for `hero_image_url`. Must be a string:", `hero_image_url`))
        }
        self$`hero_image_url` <- `hero_image_url`
      }
      if (!is.null(`hero_pin_id`)) {
        if (!(is.character(`hero_pin_id`) && length(`hero_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `hero_pin_id`. Must be a string:", `hero_pin_id`))
        }
        self$`hero_pin_id` <- `hero_pin_id`
      }
      if (!is.null(`image_tag`)) {
        if (!(is.character(`image_tag`) && length(`image_tag`) == 1)) {
          stop(paste("Error! Invalid data for `image_tag`. Must be a string:", `image_tag`))
        }
        self$`image_tag` <- `image_tag`
      }
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!is.null(`preferred_media_type`)) {
        if (!(`preferred_media_type` %in% c("VIDEO", "IMAGE"))) {
          stop(paste("Error! \"", `preferred_media_type`, "\" cannot be assigned to `preferred_media_type`. Must be \"VIDEO\", \"IMAGE\".", sep = ""))
        }
        if (!(is.character(`preferred_media_type`) && length(`preferred_media_type`) == 1)) {
          stop(paste("Error! Invalid data for `preferred_media_type`. Must be a string:", `preferred_media_type`))
        }
        self$`preferred_media_type` <- `preferred_media_type`
      }
      if (!is.null(`video_tag`)) {
        if (!(is.character(`video_tag`) && length(`video_tag`) == 1)) {
          stop(paste("Error! Invalid data for `video_tag`. Must be a string:", `video_tag`))
        }
        self$`video_tag` <- `video_tag`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return AdPreviewShopping as a base R list.
    #' @examples
    #' # convert array of AdPreviewShopping (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AdPreviewShopping to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdPreviewShoppingObject <- list()
      if (!is.null(self$`catalog_product_group_id`)) {
        AdPreviewShoppingObject[["catalog_product_group_id"]] <-
          self$`catalog_product_group_id`
      }
      if (!is.null(self$`creative_type`)) {
        AdPreviewShoppingObject[["creative_type"]] <-
          self$`creative_type`
      }
      if (!is.null(self$`customizable_cta_type`)) {
        AdPreviewShoppingObject[["customizable_cta_type"]] <-
          self$`customizable_cta_type`$toSimpleType()
      }
      if (!is.null(self$`hero_image_title`)) {
        AdPreviewShoppingObject[["hero_image_title"]] <-
          self$`hero_image_title`
      }
      if (!is.null(self$`hero_image_url`)) {
        AdPreviewShoppingObject[["hero_image_url"]] <-
          self$`hero_image_url`
      }
      if (!is.null(self$`hero_pin_id`)) {
        AdPreviewShoppingObject[["hero_pin_id"]] <-
          self$`hero_pin_id`
      }
      if (!is.null(self$`image_tag`)) {
        AdPreviewShoppingObject[["image_tag"]] <-
          self$`image_tag`
      }
      if (!is.null(self$`item_id`)) {
        AdPreviewShoppingObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`preferred_media_type`)) {
        AdPreviewShoppingObject[["preferred_media_type"]] <-
          self$`preferred_media_type`
      }
      if (!is.null(self$`video_tag`)) {
        AdPreviewShoppingObject[["video_tag"]] <-
          self$`video_tag`
      }
      return(AdPreviewShoppingObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewShopping
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewShopping
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_product_group_id`)) {
        self$`catalog_product_group_id` <- this_object$`catalog_product_group_id`
      }
      if (!is.null(this_object$`creative_type`)) {
        if (!is.null(this_object$`creative_type`) && !(this_object$`creative_type` %in% c("SHOPPING", "CAROUSEL", "COLLECTION", "REGULAR"))) {
          stop(paste("Error! \"", this_object$`creative_type`, "\" cannot be assigned to `creative_type`. Must be \"SHOPPING\", \"CAROUSEL\", \"COLLECTION\", \"REGULAR\".", sep = ""))
        }
        self$`creative_type` <- this_object$`creative_type`
      }
      if (!is.null(this_object$`customizable_cta_type`)) {
        `customizable_cta_type_object` <- CustomizableCTAType$new()
        `customizable_cta_type_object`$fromJSON(jsonlite::toJSON(this_object$`customizable_cta_type`, auto_unbox = TRUE, digits = NA))
        self$`customizable_cta_type` <- `customizable_cta_type_object`
      }
      if (!is.null(this_object$`hero_image_title`)) {
        self$`hero_image_title` <- this_object$`hero_image_title`
      }
      if (!is.null(this_object$`hero_image_url`)) {
        self$`hero_image_url` <- this_object$`hero_image_url`
      }
      if (!is.null(this_object$`hero_pin_id`)) {
        self$`hero_pin_id` <- this_object$`hero_pin_id`
      }
      if (!is.null(this_object$`image_tag`)) {
        self$`image_tag` <- this_object$`image_tag`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`preferred_media_type`)) {
        if (!is.null(this_object$`preferred_media_type`) && !(this_object$`preferred_media_type` %in% c("VIDEO", "IMAGE"))) {
          stop(paste("Error! \"", this_object$`preferred_media_type`, "\" cannot be assigned to `preferred_media_type`. Must be \"VIDEO\", \"IMAGE\".", sep = ""))
        }
        self$`preferred_media_type` <- this_object$`preferred_media_type`
      }
      if (!is.null(this_object$`video_tag`)) {
        self$`video_tag` <- this_object$`video_tag`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdPreviewShopping in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewShopping
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewShopping
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_product_group_id` <- this_object$`catalog_product_group_id`
      if (!is.null(this_object$`creative_type`) && !(this_object$`creative_type` %in% c("SHOPPING", "CAROUSEL", "COLLECTION", "REGULAR"))) {
        stop(paste("Error! \"", this_object$`creative_type`, "\" cannot be assigned to `creative_type`. Must be \"SHOPPING\", \"CAROUSEL\", \"COLLECTION\", \"REGULAR\".", sep = ""))
      }
      self$`creative_type` <- this_object$`creative_type`
      self$`customizable_cta_type` <- CustomizableCTAType$new()$fromJSON(jsonlite::toJSON(this_object$`customizable_cta_type`, auto_unbox = TRUE, digits = NA))
      self$`hero_image_title` <- this_object$`hero_image_title`
      self$`hero_image_url` <- this_object$`hero_image_url`
      self$`hero_pin_id` <- this_object$`hero_pin_id`
      self$`image_tag` <- this_object$`image_tag`
      self$`item_id` <- this_object$`item_id`
      if (!is.null(this_object$`preferred_media_type`) && !(this_object$`preferred_media_type` %in% c("VIDEO", "IMAGE"))) {
        stop(paste("Error! \"", this_object$`preferred_media_type`, "\" cannot be assigned to `preferred_media_type`. Must be \"VIDEO\", \"IMAGE\".", sep = ""))
      }
      self$`preferred_media_type` <- this_object$`preferred_media_type`
      self$`video_tag` <- this_object$`video_tag`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdPreviewShopping and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_product_group_id`
      if (!is.null(input_json$`catalog_product_group_id`)) {
        if (!(is.character(input_json$`catalog_product_group_id`) && length(input_json$`catalog_product_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_product_group_id`. Must be a string:", input_json$`catalog_product_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewShopping: the required field `catalog_product_group_id` is missing."))
      }
      # check the required field `creative_type`
      if (!is.null(input_json$`creative_type`)) {
        if (!(is.character(input_json$`creative_type`) && length(input_json$`creative_type`) == 1)) {
          stop(paste("Error! Invalid data for `creative_type`. Must be a string:", input_json$`creative_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewShopping: the required field `creative_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPreviewShopping
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_product_group_id` is null
      if (is.null(self$`catalog_product_group_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_product_group_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `creative_type` is null
      if (is.null(self$`creative_type`)) {
        return(FALSE)
      }

      if (!str_detect(self$`hero_pin_id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `catalog_product_group_id` is null
      if (is.null(self$`catalog_product_group_id`)) {
        invalid_fields["catalog_product_group_id"] <- "Non-nullable required field `catalog_product_group_id` cannot be null."
      }

      if (!str_detect(self$`catalog_product_group_id`, "^\\d+$")) {
        invalid_fields["catalog_product_group_id"] <- "Invalid value for `catalog_product_group_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `creative_type` is null
      if (is.null(self$`creative_type`)) {
        invalid_fields["creative_type"] <- "Non-nullable required field `creative_type` cannot be null."
      }

      if (!str_detect(self$`hero_pin_id`, "^\\d+$")) {
        invalid_fields["hero_pin_id"] <- "Invalid value for `hero_pin_id`, must conform to the pattern ^\\d+$."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AdPreviewShopping$unlock()
#
## Below is an example to define the print function
# AdPreviewShopping$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewShopping$lock()

