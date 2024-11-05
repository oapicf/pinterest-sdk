#' Create a new CreateAssetGroupBody
#'
#' @description
#' CreateAssetGroupBody Class
#'
#' @docType class
#' @title CreateAssetGroupBody
#' @description CreateAssetGroupBody Class
#' @format An \code{R6Class} generator object
#' @field asset_group_name Asset Group name character
#' @field asset_group_description Asset group description character
#' @field asset_group_types Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. list(\link{AssetGroupType})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetGroupBody <- R6::R6Class(
  "CreateAssetGroupBody",
  public = list(
    `asset_group_name` = NULL,
    `asset_group_description` = NULL,
    `asset_group_types` = NULL,

    #' @description
    #' Initialize a new CreateAssetGroupBody class.
    #'
    #' @param asset_group_name Asset Group name
    #' @param asset_group_description Asset group description
    #' @param asset_group_types Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
    #' @param ... Other optional arguments.
    initialize = function(`asset_group_name`, `asset_group_description`, `asset_group_types`, ...) {
      if (!missing(`asset_group_name`)) {
        if (!(is.character(`asset_group_name`) && length(`asset_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_name`. Must be a string:", `asset_group_name`))
        }
        self$`asset_group_name` <- `asset_group_name`
      }
      if (!missing(`asset_group_description`)) {
        if (!(is.character(`asset_group_description`) && length(`asset_group_description`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_description`. Must be a string:", `asset_group_description`))
        }
        self$`asset_group_description` <- `asset_group_description`
      }
      if (!missing(`asset_group_types`)) {
        stopifnot(is.vector(`asset_group_types`), length(`asset_group_types`) != 0)
        sapply(`asset_group_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_group_types` <- `asset_group_types`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetGroupBody in JSON format
    toJSON = function() {
      CreateAssetGroupBodyObject <- list()
      if (!is.null(self$`asset_group_name`)) {
        CreateAssetGroupBodyObject[["asset_group_name"]] <-
          self$`asset_group_name`
      }
      if (!is.null(self$`asset_group_description`)) {
        CreateAssetGroupBodyObject[["asset_group_description"]] <-
          self$`asset_group_description`
      }
      if (!is.null(self$`asset_group_types`)) {
        CreateAssetGroupBodyObject[["asset_group_types"]] <-
          lapply(self$`asset_group_types`, function(x) x$toJSON())
      }
      CreateAssetGroupBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetGroupBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetGroupBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group_name`)) {
        self$`asset_group_name` <- this_object$`asset_group_name`
      }
      if (!is.null(this_object$`asset_group_description`)) {
        self$`asset_group_description` <- this_object$`asset_group_description`
      }
      if (!is.null(this_object$`asset_group_types`)) {
        self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[AssetGroupType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetGroupBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_group_name`)) {
          sprintf(
          '"asset_group_name":
            "%s"
                    ',
          self$`asset_group_name`
          )
        },
        if (!is.null(self$`asset_group_description`)) {
          sprintf(
          '"asset_group_description":
            "%s"
                    ',
          self$`asset_group_description`
          )
        },
        if (!is.null(self$`asset_group_types`)) {
          sprintf(
          '"asset_group_types":
          [%s]
',
          paste(sapply(self$`asset_group_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetGroupBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetGroupBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group_name` <- this_object$`asset_group_name`
      self$`asset_group_description` <- this_object$`asset_group_description`
      self$`asset_group_types` <- ApiClient$new()$deserializeObj(this_object$`asset_group_types`, "array[AssetGroupType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetGroupBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `asset_group_name`
      if (!is.null(input_json$`asset_group_name`)) {
        if (!(is.character(input_json$`asset_group_name`) && length(input_json$`asset_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_name`. Must be a string:", input_json$`asset_group_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetGroupBody: the required field `asset_group_name` is missing."))
      }
      # check the required field `asset_group_description`
      if (!is.null(input_json$`asset_group_description`)) {
        if (!(is.character(input_json$`asset_group_description`) && length(input_json$`asset_group_description`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_description`. Must be a string:", input_json$`asset_group_description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetGroupBody: the required field `asset_group_description` is missing."))
      }
      # check the required field `asset_group_types`
      if (!is.null(input_json$`asset_group_types`)) {
        stopifnot(is.vector(input_json$`asset_group_types`), length(input_json$`asset_group_types`) != 0)
        tmp <- sapply(input_json$`asset_group_types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetGroupBody: the required field `asset_group_types` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetGroupBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `asset_group_name` is null
      if (is.null(self$`asset_group_name`)) {
        return(FALSE)
      }

      # check if the required `asset_group_description` is null
      if (is.null(self$`asset_group_description`)) {
        return(FALSE)
      }

      # check if the required `asset_group_types` is null
      if (is.null(self$`asset_group_types`)) {
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
      # check if the required `asset_group_name` is null
      if (is.null(self$`asset_group_name`)) {
        invalid_fields["asset_group_name"] <- "Non-nullable required field `asset_group_name` cannot be null."
      }

      # check if the required `asset_group_description` is null
      if (is.null(self$`asset_group_description`)) {
        invalid_fields["asset_group_description"] <- "Non-nullable required field `asset_group_description` cannot be null."
      }

      # check if the required `asset_group_types` is null
      if (is.null(self$`asset_group_types`)) {
        invalid_fields["asset_group_types"] <- "Non-nullable required field `asset_group_types` cannot be null."
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
# CreateAssetGroupBody$unlock()
#
## Below is an example to define the print function
# CreateAssetGroupBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetGroupBody$lock()

