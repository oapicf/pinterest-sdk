#' Create a new CatalogsDeleteCreativeAssetsItem
#'
#' @description
#' A creative assets item to be deleted
#'
#' @docType class
#' @title CatalogsDeleteCreativeAssetsItem
#' @description CatalogsDeleteCreativeAssetsItem Class
#' @format An \code{R6Class} generator object
#' @field creative_assets_id The catalog creative assets id in the merchant namespace character
#' @field operation  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsDeleteCreativeAssetsItem <- R6::R6Class(
  "CatalogsDeleteCreativeAssetsItem",
  public = list(
    `creative_assets_id` = NULL,
    `operation` = NULL,

    #' @description
    #' Initialize a new CatalogsDeleteCreativeAssetsItem class.
    #'
    #' @param creative_assets_id The catalog creative assets id in the merchant namespace
    #' @param operation operation
    #' @param ... Other optional arguments.
    initialize = function(`creative_assets_id`, `operation`, ...) {
      if (!missing(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("DELETE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"DELETE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsDeleteCreativeAssetsItem in JSON format
    toJSON = function() {
      CatalogsDeleteCreativeAssetsItemObject <- list()
      if (!is.null(self$`creative_assets_id`)) {
        CatalogsDeleteCreativeAssetsItemObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`operation`)) {
        CatalogsDeleteCreativeAssetsItemObject[["operation"]] <-
          self$`operation`
      }
      CatalogsDeleteCreativeAssetsItemObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsDeleteCreativeAssetsItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsDeleteCreativeAssetsItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("DELETE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"DELETE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsDeleteCreativeAssetsItem in JSON format
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
        if (!is.null(self$`operation`)) {
          sprintf(
          '"operation":
            "%s"
                    ',
          self$`operation`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsDeleteCreativeAssetsItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsDeleteCreativeAssetsItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("DELETE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"DELETE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsDeleteCreativeAssetsItem and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsDeleteCreativeAssetsItem: the required field `creative_assets_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsDeleteCreativeAssetsItem: the required field `operation` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsDeleteCreativeAssetsItem
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

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
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

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
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
# CatalogsDeleteCreativeAssetsItem$unlock()
#
## Below is an example to define the print function
# CatalogsDeleteCreativeAssetsItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsDeleteCreativeAssetsItem$lock()

