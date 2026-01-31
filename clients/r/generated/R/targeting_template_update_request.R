#' Create a new TargetingTemplateUpdateRequest
#'
#' @description
#' TargetingTemplateUpdateRequest Class
#'
#' @docType class
#' @title TargetingTemplateUpdateRequest
#' @description TargetingTemplateUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field id Targeting template ID character
#' @field operation_type  character
#' @field targeting_attributes  \link{TargetingSpec} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateUpdateRequest <- R6::R6Class(
  "TargetingTemplateUpdateRequest",
  public = list(
    `id` = NULL,
    `operation_type` = NULL,
    `targeting_attributes` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateUpdateRequest class.
    #'
    #' @param id Targeting template ID
    #' @param operation_type operation_type
    #' @param targeting_attributes targeting_attributes
    #' @param ... Other optional arguments.
    initialize = function(`id`, `operation_type`, `targeting_attributes` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`operation_type`)) {
        if (!(`operation_type` %in% c("REMOVE", "UPDATE"))) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be \"REMOVE\", \"UPDATE\".", sep = ""))
        }
        if (!(is.character(`operation_type`) && length(`operation_type`) == 1)) {
          stop(paste("Error! Invalid data for `operation_type`. Must be a string:", `operation_type`))
        }
        self$`operation_type` <- `operation_type`
      }
      if (!is.null(`targeting_attributes`)) {
        stopifnot(R6::is.R6(`targeting_attributes`))
        self$`targeting_attributes` <- `targeting_attributes`
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
    #' @return TargetingTemplateUpdateRequest as a base R list.
    #' @examples
    #' # convert array of TargetingTemplateUpdateRequest (x) to a data frame
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
    #' Convert TargetingTemplateUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingTemplateUpdateRequestObject <- list()
      if (!is.null(self$`id`)) {
        TargetingTemplateUpdateRequestObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`operation_type`)) {
        TargetingTemplateUpdateRequestObject[["operation_type"]] <-
          self$`operation_type`
      }
      if (!is.null(self$`targeting_attributes`)) {
        TargetingTemplateUpdateRequestObject[["targeting_attributes"]] <-
          self$`targeting_attributes`$toSimpleType()
      }
      return(TargetingTemplateUpdateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`operation_type`)) {
        if (!is.null(this_object$`operation_type`) && !(this_object$`operation_type` %in% c("REMOVE", "UPDATE"))) {
          stop(paste("Error! \"", this_object$`operation_type`, "\" cannot be assigned to `operation_type`. Must be \"REMOVE\", \"UPDATE\".", sep = ""))
        }
        self$`operation_type` <- this_object$`operation_type`
      }
      if (!is.null(this_object$`targeting_attributes`)) {
        `targeting_attributes_object` <- TargetingSpec$new()
        `targeting_attributes_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
        self$`targeting_attributes` <- `targeting_attributes_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingTemplateUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`operation_type`) && !(this_object$`operation_type` %in% c("REMOVE", "UPDATE"))) {
        stop(paste("Error! \"", this_object$`operation_type`, "\" cannot be assigned to `operation_type`. Must be \"REMOVE\", \"UPDATE\".", sep = ""))
      }
      self$`operation_type` <- this_object$`operation_type`
      self$`targeting_attributes` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_attributes`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplateUpdateRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for TargetingTemplateUpdateRequest: the required field `id` is missing."))
      }
      # check the required field `operation_type`
      if (!is.null(input_json$`operation_type`)) {
        if (!(is.character(input_json$`operation_type`) && length(input_json$`operation_type`) == 1)) {
          stop(paste("Error! Invalid data for `operation_type`. Must be a string:", input_json$`operation_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingTemplateUpdateRequest: the required field `operation_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateUpdateRequest
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

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `operation_type` is null
      if (is.null(self$`operation_type`)) {
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

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `operation_type` is null
      if (is.null(self$`operation_type`)) {
        invalid_fields["operation_type"] <- "Non-nullable required field `operation_type` cannot be null."
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
# TargetingTemplateUpdateRequest$unlock()
#
## Below is an example to define the print function
# TargetingTemplateUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateUpdateRequest$lock()

