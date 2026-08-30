#' Create a new PinBase
#'
#' @description
#' PinBase Class
#'
#' @docType class
#' @title PinBase
#' @description PinBase Class
#' @format An \code{R6Class} generator object
#' @field ai_disclosures AI disclosure declarations the creator has made about this Pin. \link{AiDisclosures} [optional]
#' @field board_id The board to which this Pin belongs. character [optional]
#' @field board_owner  \link{BoardOwner} [optional]
#' @field board_section_id The board section to which this Pin belongs. character [optional]
#' @field created_at  character [optional]
#' @field creative_type  \link{CreativeType} [optional]
#' @field dominant_color Dominant pin color. Hex number, e.g. `#6E7874`. character [optional]
#' @field has_been_promoted Whether the Pin has been promoted or not. character [optional]
#' @field id  character
#' @field is_owner Whether the \"operation user_account\" is the Pin owner. character [optional]
#' @field is_product Whether the Pin is a product Pin. character [optional]
#' @field is_standard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. character [optional]
#' @field media  \link{PinMedia} [optional]
#' @field parent_pin_id The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). character [optional]
#' @field pin_metrics Pin metrics with associated time intervals if any. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinBase <- R6::R6Class(
  "PinBase",
  public = list(
    `ai_disclosures` = NULL,
    `board_id` = NULL,
    `board_owner` = NULL,
    `board_section_id` = NULL,
    `created_at` = NULL,
    `creative_type` = NULL,
    `dominant_color` = NULL,
    `has_been_promoted` = NULL,
    `id` = NULL,
    `is_owner` = NULL,
    `is_product` = NULL,
    `is_standard` = NULL,
    `media` = NULL,
    `parent_pin_id` = NULL,
    `pin_metrics` = NULL,

    #' @description
    #' Initialize a new PinBase class.
    #'
    #' @param id id
    #' @param ai_disclosures AI disclosure declarations the creator has made about this Pin.
    #' @param board_id The board to which this Pin belongs.
    #' @param board_owner board_owner
    #' @param board_section_id The board section to which this Pin belongs.
    #' @param created_at created_at
    #' @param creative_type creative_type
    #' @param dominant_color Dominant pin color. Hex number, e.g. `#6E7874`.
    #' @param has_been_promoted Whether the Pin has been promoted or not.
    #' @param is_owner Whether the \"operation user_account\" is the Pin owner.
    #' @param is_product Whether the Pin is a product Pin.
    #' @param is_standard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
    #' @param media media
    #' @param parent_pin_id The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
    #' @param pin_metrics Pin metrics with associated time intervals if any.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `ai_disclosures` = NULL, `board_id` = NULL, `board_owner` = NULL, `board_section_id` = NULL, `created_at` = NULL, `creative_type` = NULL, `dominant_color` = NULL, `has_been_promoted` = NULL, `is_owner` = NULL, `is_product` = NULL, `is_standard` = NULL, `media` = NULL, `parent_pin_id` = NULL, `pin_metrics` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`ai_disclosures`)) {
        stopifnot(R6::is.R6(`ai_disclosures`))
        self$`ai_disclosures` <- `ai_disclosures`
      }
      if (!is.null(`board_id`)) {
        if (!(is.character(`board_id`) && length(`board_id`) == 1)) {
          stop(paste("Error! Invalid data for `board_id`. Must be a string:", `board_id`))
        }
        self$`board_id` <- `board_id`
      }
      if (!is.null(`board_owner`)) {
        stopifnot(R6::is.R6(`board_owner`))
        self$`board_owner` <- `board_owner`
      }
      if (!is.null(`board_section_id`)) {
        if (!(is.character(`board_section_id`) && length(`board_section_id`) == 1)) {
          stop(paste("Error! Invalid data for `board_section_id`. Must be a string:", `board_section_id`))
        }
        self$`board_section_id` <- `board_section_id`
      }
      if (!is.null(`created_at`)) {
        if (!is.character(`created_at`)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
      }
      if (!is.null(`dominant_color`)) {
        if (!(is.character(`dominant_color`) && length(`dominant_color`) == 1)) {
          stop(paste("Error! Invalid data for `dominant_color`. Must be a string:", `dominant_color`))
        }
        self$`dominant_color` <- `dominant_color`
      }
      if (!is.null(`has_been_promoted`)) {
        if (!(is.logical(`has_been_promoted`) && length(`has_been_promoted`) == 1)) {
          stop(paste("Error! Invalid data for `has_been_promoted`. Must be a boolean:", `has_been_promoted`))
        }
        self$`has_been_promoted` <- `has_been_promoted`
      }
      if (!is.null(`is_owner`)) {
        if (!(is.logical(`is_owner`) && length(`is_owner`) == 1)) {
          stop(paste("Error! Invalid data for `is_owner`. Must be a boolean:", `is_owner`))
        }
        self$`is_owner` <- `is_owner`
      }
      if (!is.null(`is_product`)) {
        if (!(is.logical(`is_product`) && length(`is_product`) == 1)) {
          stop(paste("Error! Invalid data for `is_product`. Must be a boolean:", `is_product`))
        }
        self$`is_product` <- `is_product`
      }
      if (!is.null(`is_standard`)) {
        if (!(is.logical(`is_standard`) && length(`is_standard`) == 1)) {
          stop(paste("Error! Invalid data for `is_standard`. Must be a boolean:", `is_standard`))
        }
        self$`is_standard` <- `is_standard`
      }
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
      }
      if (!is.null(`parent_pin_id`)) {
        if (!(is.character(`parent_pin_id`) && length(`parent_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_pin_id`. Must be a string:", `parent_pin_id`))
        }
        self$`parent_pin_id` <- `parent_pin_id`
      }
      if (!is.null(`pin_metrics`)) {
        self$`pin_metrics` <- `pin_metrics`
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
    #' @return PinBase as a base R list.
    #' @examples
    #' # convert array of PinBase (x) to a data frame
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
    #' Convert PinBase to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinBaseObject <- list()
      if (!is.null(self$`ai_disclosures`)) {
        PinBaseObject[["ai_disclosures"]] <-
          self$extractSimpleType(self$`ai_disclosures`)
      }
      if (!is.null(self$`board_id`)) {
        PinBaseObject[["board_id"]] <-
          self$`board_id`
      }
      if (!is.null(self$`board_owner`)) {
        PinBaseObject[["board_owner"]] <-
          self$extractSimpleType(self$`board_owner`)
      }
      if (!is.null(self$`board_section_id`)) {
        PinBaseObject[["board_section_id"]] <-
          self$`board_section_id`
      }
      if (!is.null(self$`created_at`)) {
        PinBaseObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`creative_type`)) {
        PinBaseObject[["creative_type"]] <-
          self$extractSimpleType(self$`creative_type`)
      }
      if (!is.null(self$`dominant_color`)) {
        PinBaseObject[["dominant_color"]] <-
          self$`dominant_color`
      }
      if (!is.null(self$`has_been_promoted`)) {
        PinBaseObject[["has_been_promoted"]] <-
          self$`has_been_promoted`
      }
      if (!is.null(self$`id`)) {
        PinBaseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`is_owner`)) {
        PinBaseObject[["is_owner"]] <-
          self$`is_owner`
      }
      if (!is.null(self$`is_product`)) {
        PinBaseObject[["is_product"]] <-
          self$`is_product`
      }
      if (!is.null(self$`is_standard`)) {
        PinBaseObject[["is_standard"]] <-
          self$`is_standard`
      }
      if (!is.null(self$`media`)) {
        PinBaseObject[["media"]] <-
          self$extractSimpleType(self$`media`)
      }
      if (!is.null(self$`parent_pin_id`)) {
        PinBaseObject[["parent_pin_id"]] <-
          self$`parent_pin_id`
      }
      if (!is.null(self$`pin_metrics`)) {
        PinBaseObject[["pin_metrics"]] <-
          self$`pin_metrics`
      }
      return(PinBaseObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of PinBase
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinBase
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ai_disclosures`)) {
        `ai_disclosures_object` <- AiDisclosures$new()
        `ai_disclosures_object`$fromJSON(jsonlite::toJSON(this_object$`ai_disclosures`, auto_unbox = TRUE, digits = NA))
        self$`ai_disclosures` <- `ai_disclosures_object`
      }
      if (!is.null(this_object$`board_id`)) {
        self$`board_id` <- this_object$`board_id`
      }
      if (!is.null(this_object$`board_owner`)) {
        `board_owner_object` <- BoardOwner$new()
        `board_owner_object`$fromJSON(jsonlite::toJSON(this_object$`board_owner`, auto_unbox = TRUE, digits = NA))
        self$`board_owner` <- `board_owner_object`
      }
      if (!is.null(this_object$`board_section_id`)) {
        self$`board_section_id` <- this_object$`board_section_id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- CreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      if (!is.null(this_object$`dominant_color`)) {
        self$`dominant_color` <- this_object$`dominant_color`
      }
      if (!is.null(this_object$`has_been_promoted`)) {
        self$`has_been_promoted` <- this_object$`has_been_promoted`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`is_owner`)) {
        self$`is_owner` <- this_object$`is_owner`
      }
      if (!is.null(this_object$`is_product`)) {
        self$`is_product` <- this_object$`is_product`
      }
      if (!is.null(this_object$`is_standard`)) {
        self$`is_standard` <- this_object$`is_standard`
      }
      if (!is.null(this_object$`media`)) {
        `media_object` <- PinMedia$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
      }
      if (!is.null(this_object$`parent_pin_id`)) {
        self$`parent_pin_id` <- this_object$`parent_pin_id`
      }
      if (!is.null(this_object$`pin_metrics`)) {
        self$`pin_metrics` <- this_object$`pin_metrics`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinBase in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinBase
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinBase
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ai_disclosures` <- AiDisclosures$new()$fromJSON(jsonlite::toJSON(this_object$`ai_disclosures`, auto_unbox = TRUE, digits = NA))
      self$`board_id` <- this_object$`board_id`
      self$`board_owner` <- BoardOwner$new()$fromJSON(jsonlite::toJSON(this_object$`board_owner`, auto_unbox = TRUE, digits = NA))
      self$`board_section_id` <- this_object$`board_section_id`
      self$`created_at` <- this_object$`created_at`
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self$`dominant_color` <- this_object$`dominant_color`
      self$`has_been_promoted` <- this_object$`has_been_promoted`
      self$`id` <- this_object$`id`
      self$`is_owner` <- this_object$`is_owner`
      self$`is_product` <- this_object$`is_product`
      self$`is_standard` <- this_object$`is_standard`
      self$`media` <- PinMedia$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`parent_pin_id` <- this_object$`parent_pin_id`
      self$`pin_metrics` <- this_object$`pin_metrics`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinBase and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinBase: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinBase
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`board_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_pin_id`, "^\\d+$")) {
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
      if (!str_detect(self$`board_id`, "^\\d+$")) {
        invalid_fields["board_id"] <- "Invalid value for `board_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        invalid_fields["board_section_id"] <- "Invalid value for `board_section_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`parent_pin_id`, "^\\d+$")) {
        invalid_fields["parent_pin_id"] <- "Invalid value for `parent_pin_id`, must conform to the pattern ^\\d+$."
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
# PinBase$unlock()
#
## Below is an example to define the print function
# PinBase$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinBase$lock()

