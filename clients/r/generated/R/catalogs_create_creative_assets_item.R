#' Create a new CatalogsCreateCreativeAssetsItem
#'
#' @description
#' A creative assets item to be created.
#'
#' @docType class
#' @title CatalogsCreateCreativeAssetsItem
#' @description CatalogsCreateCreativeAssetsItem Class
#' @format An \code{R6Class} generator object
#' @field creative_assets_id The catalog creative assets id in the merchant namespace character
#' @field operation  character
#' @field attributes  \link{CatalogsCreativeAssetsAttributes}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreateCreativeAssetsItem <- R6::R6Class(
  "CatalogsCreateCreativeAssetsItem",
  public = list(
    `creative_assets_id` = NULL,
    `operation` = NULL,
    `attributes` = NULL,

    #' @description
    #' Initialize a new CatalogsCreateCreativeAssetsItem class.
    #'
    #' @param creative_assets_id The catalog creative assets id in the merchant namespace
    #' @param operation operation
    #' @param attributes attributes
    #' @param ... Other optional arguments.
    initialize = function(`creative_assets_id`, `operation`, `attributes`, ...) {
      if (!missing(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreateCreativeAssetsItem in JSON format
    toJSON = function() {
      CatalogsCreateCreativeAssetsItemObject <- list()
      if (!is.null(self$`creative_assets_id`)) {
        CatalogsCreateCreativeAssetsItemObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`operation`)) {
        CatalogsCreateCreativeAssetsItemObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`attributes`)) {
        CatalogsCreateCreativeAssetsItemObject[["attributes"]] <-
          self$`attributes`$toJSON()
      }
      CatalogsCreateCreativeAssetsItemObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateCreativeAssetsItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateCreativeAssetsItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- CatalogsCreativeAssetsAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreateCreativeAssetsItem in JSON format
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
        },
        if (!is.null(self$`attributes`)) {
          sprintf(
          '"attributes":
          %s
          ',
          jsonlite::toJSON(self$`attributes`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateCreativeAssetsItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateCreativeAssetsItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`attributes` <- CatalogsCreativeAssetsAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreateCreativeAssetsItem and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreateCreativeAssetsItem: the required field `creative_assets_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreateCreativeAssetsItem: the required field `operation` is missing."))
      }
      # check the required field `attributes`
      if (!is.null(input_json$`attributes`)) {
        stopifnot(R6::is.R6(input_json$`attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreateCreativeAssetsItem: the required field `attributes` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreateCreativeAssetsItem
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

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
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

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        invalid_fields["attributes"] <- "Non-nullable required field `attributes` cannot be null."
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
# CatalogsCreateCreativeAssetsItem$unlock()
#
## Below is an example to define the print function
# CatalogsCreateCreativeAssetsItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreateCreativeAssetsItem$lock()

