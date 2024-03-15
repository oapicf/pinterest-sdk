#' Create a new CustomerListRequest
#'
#' @description
#' CustomerListRequest Class
#'
#' @docType class
#' @title CustomerListRequest
#' @description CustomerListRequest Class
#' @format An \code{R6Class} generator object
#' @field name Customer list name. character
#' @field records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. character
#' @field list_type  \link{UserListType} [optional]
#' @field exceptions Customer list errors. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListRequest <- R6::R6Class(
  "CustomerListRequest",
  public = list(
    `name` = NULL,
    `records` = NULL,
    `list_type` = NULL,
    `exceptions` = NULL,
    #' Initialize a new CustomerListRequest class.
    #'
    #' @description
    #' Initialize a new CustomerListRequest class.
    #'
    #' @param name Customer list name.
    #' @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    #' @param list_type list_type. Default to "EMAIL".
    #' @param exceptions Customer list errors.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `records`, `list_type` = "EMAIL", `exceptions` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`records`)) {
        if (!(is.character(`records`) && length(`records`) == 1)) {
          stop(paste("Error! Invalid data for `records`. Must be a string:", `records`))
        }
        self$`records` <- `records`
      }
      if (!is.null(`list_type`)) {
        if (!(`list_type` %in% c())) {
          stop(paste("Error! \"", `list_type`, "\" cannot be assigned to `list_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`list_type`))
        self$`list_type` <- `list_type`
      }
      if (!is.null(`exceptions`)) {
        self$`exceptions` <- `exceptions`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomerListRequest in JSON format
    #' @export
    toJSON = function() {
      CustomerListRequestObject <- list()
      if (!is.null(self$`name`)) {
        CustomerListRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`records`)) {
        CustomerListRequestObject[["records"]] <-
          self$`records`
      }
      if (!is.null(self$`list_type`)) {
        CustomerListRequestObject[["list_type"]] <-
          self$`list_type`$toJSON()
      }
      if (!is.null(self$`exceptions`)) {
        CustomerListRequestObject[["exceptions"]] <-
          self$`exceptions`
      }
      CustomerListRequestObject
    },
    #' Deserialize JSON string into an instance of CustomerListRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomerListRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`records`)) {
        self$`records` <- this_object$`records`
      }
      if (!is.null(this_object$`list_type`)) {
        `list_type_object` <- UserListType$new()
        `list_type_object`$fromJSON(jsonlite::toJSON(this_object$`list_type`, auto_unbox = TRUE, digits = NA))
        self$`list_type` <- `list_type_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- this_object$`exceptions`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomerListRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`records`)) {
          sprintf(
          '"records":
            "%s"
                    ',
          self$`records`
          )
        },
        if (!is.null(self$`list_type`)) {
          sprintf(
          '"list_type":
          %s
          ',
          jsonlite::toJSON(self$`list_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`exceptions`)) {
          sprintf(
          '"exceptions":
            "%s"
                    ',
          self$`exceptions`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CustomerListRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomerListRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`records` <- this_object$`records`
      self$`list_type` <- UserListType$new()$fromJSON(jsonlite::toJSON(this_object$`list_type`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- this_object$`exceptions`
      self
    },
    #' Validate JSON input with respect to CustomerListRequest
    #'
    #' @description
    #' Validate JSON input with respect to CustomerListRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListRequest: the required field `name` is missing."))
      }
      # check the required field `records`
      if (!is.null(input_json$`records`)) {
        if (!(is.character(input_json$`records`) && length(input_json$`records`) == 1)) {
          stop(paste("Error! Invalid data for `records`. Must be a string:", input_json$`records`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListRequest: the required field `records` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `records` is null
      if (is.null(self$`records`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `records` is null
      if (is.null(self$`records`)) {
        invalid_fields["records"] <- "Non-nullable required field `records` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CustomerListRequest$unlock()
#
## Below is an example to define the print function
# CustomerListRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListRequest$lock()

