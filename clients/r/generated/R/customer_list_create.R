#' Create a new CustomerListCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title CustomerListCreate
#' @description CustomerListCreate Class
#' @format An \code{R6Class} generator object
#' @field is_nca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. character [optional]
#' @field list_type Type of customer list (e.g., EMAIL, IDFA, MAID). \link{UserListType} [optional]
#' @field name Customer list name. character
#' @field records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. character [optional]
#' @field records_v2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. list(\link{CustomerListRecordRow}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListCreate <- R6::R6Class(
  "CustomerListCreate",
  public = list(
    `is_nca` = NULL,
    `list_type` = NULL,
    `name` = NULL,
    `records` = NULL,
    `records_v2` = NULL,

    #' @description
    #' Initialize a new CustomerListCreate class.
    #'
    #' @param name Customer list name.
    #' @param is_nca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
    #' @param list_type Type of customer list (e.g., EMAIL, IDFA, MAID).
    #' @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    #' @param records_v2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
    #' @param ... Other optional arguments.
    initialize = function(`name`, `is_nca` = NULL, `list_type` = NULL, `records` = NULL, `records_v2` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`is_nca`)) {
        if (!(is.logical(`is_nca`) && length(`is_nca`) == 1)) {
          stop(paste("Error! Invalid data for `is_nca`. Must be a boolean:", `is_nca`))
        }
        self$`is_nca` <- `is_nca`
      }
      if (!is.null(`list_type`)) {
        if (!(`list_type` %in% c())) {
          stop(paste("Error! \"", `list_type`, "\" cannot be assigned to `list_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`list_type`))
        self$`list_type` <- `list_type`
      }
      if (!is.null(`records`)) {
        if (!(is.character(`records`) && length(`records`) == 1)) {
          stop(paste("Error! Invalid data for `records`. Must be a string:", `records`))
        }
        self$`records` <- `records`
      }
      if (!is.null(`records_v2`)) {
        stopifnot(is.vector(`records_v2`), length(`records_v2`) != 0)
        sapply(`records_v2`, function(x) stopifnot(R6::is.R6(x)))
        self$`records_v2` <- `records_v2`
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
    #' @return CustomerListCreate as a base R list.
    #' @examples
    #' # convert array of CustomerListCreate (x) to a data frame
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
    #' Convert CustomerListCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListCreateObject <- list()
      if (!is.null(self$`is_nca`)) {
        CustomerListCreateObject[["is_nca"]] <-
          self$`is_nca`
      }
      if (!is.null(self$`list_type`)) {
        CustomerListCreateObject[["list_type"]] <-
          self$extractSimpleType(self$`list_type`)
      }
      if (!is.null(self$`name`)) {
        CustomerListCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`records`)) {
        CustomerListCreateObject[["records"]] <-
          self$`records`
      }
      if (!is.null(self$`records_v2`)) {
        CustomerListCreateObject[["records_v2"]] <-
          self$extractSimpleType(self$`records_v2`)
      }
      return(CustomerListCreateObject)
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
    #' Deserialize JSON string into an instance of CustomerListCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`is_nca`)) {
        self$`is_nca` <- this_object$`is_nca`
      }
      if (!is.null(this_object$`list_type`)) {
        `list_type_object` <- UserListType$new()
        `list_type_object`$fromJSON(jsonlite::toJSON(this_object$`list_type`, auto_unbox = TRUE, digits = NA))
        self$`list_type` <- `list_type_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`records`)) {
        self$`records` <- this_object$`records`
      }
      if (!is.null(this_object$`records_v2`)) {
        self$`records_v2` <- ApiClient$new()$deserializeObj(this_object$`records_v2`, "array[CustomerListRecordRow]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerListCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`is_nca` <- this_object$`is_nca`
      self$`list_type` <- UserListType$new()$fromJSON(jsonlite::toJSON(this_object$`list_type`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`records` <- this_object$`records`
      self$`records_v2` <- ApiClient$new()$deserializeObj(this_object$`records_v2`, "array[CustomerListRecordRow]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListCreate: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CustomerListCreate$unlock()
#
## Below is an example to define the print function
# CustomerListCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListCreate$lock()

