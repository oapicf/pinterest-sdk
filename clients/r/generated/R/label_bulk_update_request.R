#' Create a new LabelBulkUpdateRequest
#'
#' @description
#' LabelBulkUpdateRequest Class
#'
#' @docType class
#' @title LabelBulkUpdateRequest
#' @description LabelBulkUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field id Label ID. character
#' @field parent_id Unique identifier of the asset you are labelling. Currently, you can only label campaigns. character
#' @field status  \link{LabelStatusBulkUpdate}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelBulkUpdateRequest <- R6::R6Class(
  "LabelBulkUpdateRequest",
  public = list(
    `id` = NULL,
    `parent_id` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new LabelBulkUpdateRequest class.
    #'
    #' @param id Label ID.
    #' @param parent_id Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`id`, `parent_id`, `status`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
      }
      if (!missing(`status`)) {
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
    #' @return LabelBulkUpdateRequest as a base R list.
    #' @examples
    #' # convert array of LabelBulkUpdateRequest (x) to a data frame
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
    #' Convert LabelBulkUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelBulkUpdateRequestObject <- list()
      if (!is.null(self$`id`)) {
        LabelBulkUpdateRequestObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`parent_id`)) {
        LabelBulkUpdateRequestObject[["parent_id"]] <-
          self$`parent_id`
      }
      if (!is.null(self$`status`)) {
        LabelBulkUpdateRequestObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(LabelBulkUpdateRequestObject)
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
    #' Deserialize JSON string into an instance of LabelBulkUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelBulkUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- LabelStatusBulkUpdate$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LabelBulkUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelBulkUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelBulkUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`parent_id` <- this_object$`parent_id`
      self$`status` <- LabelStatusBulkUpdate$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelBulkUpdateRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for LabelBulkUpdateRequest: the required field `id` is missing."))
      }
      # check the required field `parent_id`
      if (!is.null(input_json$`parent_id`)) {
        if (!(is.character(input_json$`parent_id`) && length(input_json$`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", input_json$`parent_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelBulkUpdateRequest: the required field `parent_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelBulkUpdateRequest: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelBulkUpdateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        invalid_fields["parent_id"] <- "Non-nullable required field `parent_id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# LabelBulkUpdateRequest$unlock()
#
## Below is an example to define the print function
# LabelBulkUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelBulkUpdateRequest$lock()

