#' Create a new CustomerListUploadCreateRequest
#'
#' @description
#' CustomerListUploadCreateRequest Class
#'
#' @docType class
#' @title CustomerListUploadCreateRequest
#' @description CustomerListUploadCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field operation  \link{UserListOperationType}
#' @field total_parts Number of parts to upload the file in. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListUploadCreateRequest <- R6::R6Class(
  "CustomerListUploadCreateRequest",
  public = list(
    `operation` = NULL,
    `total_parts` = NULL,

    #' @description
    #' Initialize a new CustomerListUploadCreateRequest class.
    #'
    #' @param operation operation
    #' @param total_parts Number of parts to upload the file in.
    #' @param ... Other optional arguments.
    initialize = function(`operation`, `total_parts`, ...) {
      if (!missing(`operation`)) {
        if (!(`operation` %in% c())) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation`))
        self$`operation` <- `operation`
      }
      if (!missing(`total_parts`)) {
        if (!(is.numeric(`total_parts`) && length(`total_parts`) == 1)) {
          stop(paste("Error! Invalid data for `total_parts`. Must be an integer:", `total_parts`))
        }
        self$`total_parts` <- `total_parts`
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
    #' @return CustomerListUploadCreateRequest as a base R list.
    #' @examples
    #' # convert array of CustomerListUploadCreateRequest (x) to a data frame
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
    #' Convert CustomerListUploadCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListUploadCreateRequestObject <- list()
      if (!is.null(self$`operation`)) {
        CustomerListUploadCreateRequestObject[["operation"]] <-
          self$`operation`$toSimpleType()
      }
      if (!is.null(self$`total_parts`)) {
        CustomerListUploadCreateRequestObject[["total_parts"]] <-
          self$`total_parts`
      }
      return(CustomerListUploadCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUploadCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUploadCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`operation`)) {
        `operation_object` <- UserListOperationType$new()
        `operation_object`$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
        self$`operation` <- `operation_object`
      }
      if (!is.null(this_object$`total_parts`)) {
        self$`total_parts` <- this_object$`total_parts`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerListUploadCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUploadCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUploadCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`operation` <- UserListOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
      self$`total_parts` <- this_object$`total_parts`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListUploadCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        stopifnot(R6::is.R6(input_json$`operation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUploadCreateRequest: the required field `operation` is missing."))
      }
      # check the required field `total_parts`
      if (!is.null(input_json$`total_parts`)) {
        if (!(is.numeric(input_json$`total_parts`) && length(input_json$`total_parts`) == 1)) {
          stop(paste("Error! Invalid data for `total_parts`. Must be an integer:", input_json$`total_parts`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUploadCreateRequest: the required field `total_parts` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListUploadCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `total_parts` is null
      if (is.null(self$`total_parts`)) {
        return(FALSE)
      }

      if (self$`total_parts` > 10) {
        return(FALSE)
      }
      if (self$`total_parts` < 1) {
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
      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `total_parts` is null
      if (is.null(self$`total_parts`)) {
        invalid_fields["total_parts"] <- "Non-nullable required field `total_parts` cannot be null."
      }

      if (self$`total_parts` > 10) {
        invalid_fields["total_parts"] <- "Invalid value for `total_parts`, must be smaller than or equal to 10."
      }
      if (self$`total_parts` < 1) {
        invalid_fields["total_parts"] <- "Invalid value for `total_parts`, must be bigger than or equal to 1."
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
# CustomerListUploadCreateRequest$unlock()
#
## Below is an example to define the print function
# CustomerListUploadCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListUploadCreateRequest$lock()

