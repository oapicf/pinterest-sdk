#' Create a new CustomerListUpdateRequest
#'
#' @description
#' CustomerListUpdateRequest Class
#'
#' @docType class
#' @title CustomerListUpdateRequest
#' @description CustomerListUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. character
#' @field operation_type  \link{UserListOperationType}
#' @field exceptions  \link{Exception} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListUpdateRequest <- R6::R6Class(
  "CustomerListUpdateRequest",
  public = list(
    `records` = NULL,
    `operation_type` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new CustomerListUpdateRequest class.
    #'
    #' @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    #' @param operation_type operation_type
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    initialize = function(`records`, `operation_type`, `exceptions` = NULL, ...) {
      if (!missing(`records`)) {
        if (!(is.character(`records`) && length(`records`) == 1)) {
          stop(paste("Error! Invalid data for `records`. Must be a string:", `records`))
        }
        self$`records` <- `records`
      }
      if (!missing(`operation_type`)) {
        if (!(`operation_type` %in% c())) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation_type`))
        self$`operation_type` <- `operation_type`
      }
      if (!is.null(`exceptions`)) {
        stopifnot(R6::is.R6(`exceptions`))
        self$`exceptions` <- `exceptions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CustomerListUpdateRequest in JSON format
    toJSON = function() {
      CustomerListUpdateRequestObject <- list()
      if (!is.null(self$`records`)) {
        CustomerListUpdateRequestObject[["records"]] <-
          self$`records`
      }
      if (!is.null(self$`operation_type`)) {
        CustomerListUpdateRequestObject[["operation_type"]] <-
          self$`operation_type`$toJSON()
      }
      if (!is.null(self$`exceptions`)) {
        CustomerListUpdateRequestObject[["exceptions"]] <-
          self$`exceptions`$toJSON()
      }
      CustomerListUpdateRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`records`)) {
        self$`records` <- this_object$`records`
      }
      if (!is.null(this_object$`operation_type`)) {
        `operation_type_object` <- UserListOperationType$new()
        `operation_type_object`$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
        self$`operation_type` <- `operation_type_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        `exceptions_object` <- Exception$new()
        `exceptions_object`$fromJSON(jsonlite::toJSON(this_object$`exceptions`, auto_unbox = TRUE, digits = NA))
        self$`exceptions` <- `exceptions_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CustomerListUpdateRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`records`)) {
          sprintf(
          '"records":
            "%s"
                    ',
          self$`records`
          )
        },
        if (!is.null(self$`operation_type`)) {
          sprintf(
          '"operation_type":
          %s
          ',
          jsonlite::toJSON(self$`operation_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`exceptions`)) {
          sprintf(
          '"exceptions":
          %s
          ',
          jsonlite::toJSON(self$`exceptions`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`records` <- this_object$`records`
      self$`operation_type` <- UserListOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- Exception$new()$fromJSON(jsonlite::toJSON(this_object$`exceptions`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `records`
      if (!is.null(input_json$`records`)) {
        if (!(is.character(input_json$`records`) && length(input_json$`records`) == 1)) {
          stop(paste("Error! Invalid data for `records`. Must be a string:", input_json$`records`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpdateRequest: the required field `records` is missing."))
      }
      # check the required field `operation_type`
      if (!is.null(input_json$`operation_type`)) {
        stopifnot(R6::is.R6(input_json$`operation_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpdateRequest: the required field `operation_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListUpdateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `records` is null
      if (is.null(self$`records`)) {
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
      # check if the required `records` is null
      if (is.null(self$`records`)) {
        invalid_fields["records"] <- "Non-nullable required field `records` cannot be null."
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
# CustomerListUpdateRequest$unlock()
#
## Below is an example to define the print function
# CustomerListUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListUpdateRequest$lock()

