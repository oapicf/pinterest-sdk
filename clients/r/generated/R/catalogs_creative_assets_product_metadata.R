#' Create a new CatalogsCreativeAssetsProductMetadata
#'
#' @description
#' Creative assets product metadata entity
#'
#' @docType class
#' @title CatalogsCreativeAssetsProductMetadata
#' @description CatalogsCreativeAssetsProductMetadata Class
#' @format An \code{R6Class} generator object
#' @field creative_assets_id The user-created unique ID that represents the creative assets item. character
#' @field visibility  \link{CreativeAssetsVisibilityType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsProductMetadata <- R6::R6Class(
  "CatalogsCreativeAssetsProductMetadata",
  public = list(
    `creative_assets_id` = NULL,
    `visibility` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsProductMetadata class.
    #'
    #' @param creative_assets_id The user-created unique ID that represents the creative assets item.
    #' @param visibility visibility
    #' @param ... Other optional arguments.
    initialize = function(`creative_assets_id`, `visibility`, ...) {
      if (!missing(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
      }
      if (!missing(`visibility`)) {
        if (!(`visibility` %in% c())) {
          stop(paste("Error! \"", `visibility`, "\" cannot be assigned to `visibility`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`visibility`))
        self$`visibility` <- `visibility`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsProductMetadata in JSON format
    toJSON = function() {
      CatalogsCreativeAssetsProductMetadataObject <- list()
      if (!is.null(self$`creative_assets_id`)) {
        CatalogsCreativeAssetsProductMetadataObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`visibility`)) {
        CatalogsCreativeAssetsProductMetadataObject[["visibility"]] <-
          self$`visibility`$toJSON()
      }
      CatalogsCreativeAssetsProductMetadataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsProductMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
      }
      if (!is.null(this_object$`visibility`)) {
        `visibility_object` <- CreativeAssetsVisibilityType$new()
        `visibility_object`$fromJSON(jsonlite::toJSON(this_object$`visibility`, auto_unbox = TRUE, digits = NA))
        self$`visibility` <- `visibility_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsProductMetadata in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`creative_assets_id`)) {
          sprintf(
          '"creative_assets_id":
            "%s"
                    ',
          self$`creative_assets_id`
          )
        },
        if (!is.null(self$`visibility`)) {
          sprintf(
          '"visibility":
          %s
          ',
          jsonlite::toJSON(self$`visibility`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsProductMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      self$`visibility` <- CreativeAssetsVisibilityType$new()$fromJSON(jsonlite::toJSON(this_object$`visibility`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsProductMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `creative_assets_id`
      if (!is.null(input_json$`creative_assets_id`)) {
        if (!(is.character(input_json$`creative_assets_id`) && length(input_json$`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", input_json$`creative_assets_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsProductMetadata: the required field `creative_assets_id` is missing."))
      }
      # check the required field `visibility`
      if (!is.null(input_json$`visibility`)) {
        stopifnot(R6::is.R6(input_json$`visibility`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsProductMetadata: the required field `visibility` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsProductMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `creative_assets_id` is null
      if (is.null(self$`creative_assets_id`)) {
        return(FALSE)
      }

      # check if the required `visibility` is null
      if (is.null(self$`visibility`)) {
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
      # check if the required `creative_assets_id` is null
      if (is.null(self$`creative_assets_id`)) {
        invalid_fields["creative_assets_id"] <- "Non-nullable required field `creative_assets_id` cannot be null."
      }

      # check if the required `visibility` is null
      if (is.null(self$`visibility`)) {
        invalid_fields["visibility"] <- "Non-nullable required field `visibility` cannot be null."
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
# CatalogsCreativeAssetsProductMetadata$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsProductMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsProductMetadata$lock()

