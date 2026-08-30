#' Create a new EntityLabel
#'
#' @description
#' EntityLabel Class
#'
#' @docType class
#' @title EntityLabel
#' @description EntityLabel Class
#' @format An \code{R6Class} generator object
#' @field entity_id Entity ID to apply label to. character
#' @field entity_type  \link{LabelParentType} [optional]
#' @field label_id Label ID. character
#' @field status  \link{EntityLabelStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EntityLabel <- R6::R6Class(
  "EntityLabel",
  public = list(
    `entity_id` = NULL,
    `entity_type` = NULL,
    `label_id` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new EntityLabel class.
    #'
    #' @param entity_id Entity ID to apply label to.
    #' @param label_id Label ID.
    #' @param entity_type entity_type
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`entity_id`, `label_id`, `entity_type` = NULL, `status` = NULL, ...) {
      if (!missing(`entity_id`)) {
        if (!(is.character(`entity_id`) && length(`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", `entity_id`))
        }
        self$`entity_id` <- `entity_id`
      }
      if (!missing(`label_id`)) {
        if (!(is.character(`label_id`) && length(`label_id`) == 1)) {
          stop(paste("Error! Invalid data for `label_id`. Must be a string:", `label_id`))
        }
        self$`label_id` <- `label_id`
      }
      if (!is.null(`entity_type`)) {
        if (!(`entity_type` %in% c())) {
          stop(paste("Error! \"", `entity_type`, "\" cannot be assigned to `entity_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`entity_type`))
        self$`entity_type` <- `entity_type`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return EntityLabel as a base R list.
    #' @examples
    #' # convert array of EntityLabel (x) to a data frame
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
    #' Convert EntityLabel to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EntityLabelObject <- list()
      if (!is.null(self$`entity_id`)) {
        EntityLabelObject[["entity_id"]] <-
          self$`entity_id`
      }
      if (!is.null(self$`entity_type`)) {
        EntityLabelObject[["entity_type"]] <-
          self$extractSimpleType(self$`entity_type`)
      }
      if (!is.null(self$`label_id`)) {
        EntityLabelObject[["label_id"]] <-
          self$`label_id`
      }
      if (!is.null(self$`status`)) {
        EntityLabelObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(EntityLabelObject)
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
    #' Deserialize JSON string into an instance of EntityLabel
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityLabel
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entity_id`)) {
        self$`entity_id` <- this_object$`entity_id`
      }
      if (!is.null(this_object$`entity_type`)) {
        `entity_type_object` <- LabelParentType$new()
        `entity_type_object`$fromJSON(jsonlite::toJSON(this_object$`entity_type`, auto_unbox = TRUE, digits = NA))
        self$`entity_type` <- `entity_type_object`
      }
      if (!is.null(this_object$`label_id`)) {
        self$`label_id` <- this_object$`label_id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityLabelStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EntityLabel in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EntityLabel
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityLabel
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entity_id` <- this_object$`entity_id`
      self$`entity_type` <- LabelParentType$new()$fromJSON(jsonlite::toJSON(this_object$`entity_type`, auto_unbox = TRUE, digits = NA))
      self$`label_id` <- this_object$`label_id`
      self$`status` <- EntityLabelStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to EntityLabel and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `entity_id`
      if (!is.null(input_json$`entity_id`)) {
        if (!(is.character(input_json$`entity_id`) && length(input_json$`entity_id`) == 1)) {
          stop(paste("Error! Invalid data for `entity_id`. Must be a string:", input_json$`entity_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EntityLabel: the required field `entity_id` is missing."))
      }
      # check the required field `label_id`
      if (!is.null(input_json$`label_id`)) {
        if (!(is.character(input_json$`label_id`) && length(input_json$`label_id`) == 1)) {
          stop(paste("Error! Invalid data for `label_id`. Must be a string:", input_json$`label_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EntityLabel: the required field `label_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EntityLabel
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `entity_id` is null
      if (is.null(self$`entity_id`)) {
        return(FALSE)
      }

      # check if the required `label_id` is null
      if (is.null(self$`label_id`)) {
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
      # check if the required `entity_id` is null
      if (is.null(self$`entity_id`)) {
        invalid_fields["entity_id"] <- "Non-nullable required field `entity_id` cannot be null."
      }

      # check if the required `label_id` is null
      if (is.null(self$`label_id`)) {
        invalid_fields["label_id"] <- "Non-nullable required field `label_id` cannot be null."
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
# EntityLabel$unlock()
#
## Below is an example to define the print function
# EntityLabel$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EntityLabel$lock()

