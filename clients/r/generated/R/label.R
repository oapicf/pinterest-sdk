#' Create a new Label
#'
#' @description
#' Label Class
#'
#' @docType class
#' @title Label
#' @description Label Class
#' @format An \code{R6Class} generator object
#' @field id Label ID. character [optional]
#' @field label_type  \link{LabelType} [optional]
#' @field parent_id Label parent entity ID. character [optional]
#' @field parent_type Label parent entity type. character [optional]
#' @field status  \link{LabelStatus} [optional]
#' @field value Label name. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Label <- R6::R6Class(
  "Label",
  public = list(
    `id` = NULL,
    `label_type` = NULL,
    `parent_id` = NULL,
    `parent_type` = NULL,
    `status` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new Label class.
    #'
    #' @param id Label ID.
    #' @param label_type label_type
    #' @param parent_id Label parent entity ID.
    #' @param parent_type Label parent entity type.
    #' @param status status
    #' @param value Label name.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `label_type` = NULL, `parent_id` = NULL, `parent_type` = NULL, `status` = NULL, `value` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`label_type`)) {
        if (!(`label_type` %in% c())) {
          stop(paste("Error! \"", `label_type`, "\" cannot be assigned to `label_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`label_type`))
        self$`label_type` <- `label_type`
      }
      if (!is.null(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
      }
      if (!is.null(`parent_type`)) {
        if (!(`parent_type` %in% c("CAMPAIGN"))) {
          stop(paste("Error! \"", `parent_type`, "\" cannot be assigned to `parent_type`. Must be \"CAMPAIGN\".", sep = ""))
        }
        if (!(is.character(`parent_type`) && length(`parent_type`) == 1)) {
          stop(paste("Error! Invalid data for `parent_type`. Must be a string:", `parent_type`))
        }
        self$`parent_type` <- `parent_type`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
    #' @return Label as a base R list.
    #' @examples
    #' # convert array of Label (x) to a data frame
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
    #' Convert Label to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelObject <- list()
      if (!is.null(self$`id`)) {
        LabelObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`label_type`)) {
        LabelObject[["label_type"]] <-
          self$`label_type`$toSimpleType()
      }
      if (!is.null(self$`parent_id`)) {
        LabelObject[["parent_id"]] <-
          self$`parent_id`
      }
      if (!is.null(self$`parent_type`)) {
        LabelObject[["parent_type"]] <-
          self$`parent_type`
      }
      if (!is.null(self$`status`)) {
        LabelObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`value`)) {
        LabelObject[["value"]] <-
          self$`value`
      }
      return(LabelObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Label
    #'
    #' @param input_json the JSON input
    #' @return the instance of Label
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`label_type`)) {
        `label_type_object` <- LabelType$new()
        `label_type_object`$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
        self$`label_type` <- `label_type_object`
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      if (!is.null(this_object$`parent_type`)) {
        if (!is.null(this_object$`parent_type`) && !(this_object$`parent_type` %in% c("CAMPAIGN"))) {
          stop(paste("Error! \"", this_object$`parent_type`, "\" cannot be assigned to `parent_type`. Must be \"CAMPAIGN\".", sep = ""))
        }
        self$`parent_type` <- this_object$`parent_type`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- LabelStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Label in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Label
    #'
    #' @param input_json the JSON input
    #' @return the instance of Label
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`label_type` <- LabelType$new()$fromJSON(jsonlite::toJSON(this_object$`label_type`, auto_unbox = TRUE, digits = NA))
      self$`parent_id` <- this_object$`parent_id`
      if (!is.null(this_object$`parent_type`) && !(this_object$`parent_type` %in% c("CAMPAIGN"))) {
        stop(paste("Error! \"", this_object$`parent_type`, "\" cannot be assigned to `parent_type`. Must be \"CAMPAIGN\".", sep = ""))
      }
      self$`parent_type` <- this_object$`parent_type`
      self$`status` <- LabelStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to Label and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Label
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`value`) > 100) {
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
      if (nchar(self$`value`) > 100) {
        invalid_fields["value"] <- "Invalid length for `value`, must be smaller than or equal to 100."
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
# Label$unlock()
#
## Below is an example to define the print function
# Label$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Label$lock()

