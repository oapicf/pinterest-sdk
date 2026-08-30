#' Create a new AppsflyerAudienceSyncCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title AppsflyerAudienceSyncCreate
#' @description AppsflyerAudienceSyncCreate Class
#' @format An \code{R6Class} generator object
#' @field container_id The container ID of the audience character
#' @field url_adid_sha256 The pre-signed URL for SHA256 hashed GAID/IDFA file character [optional]
#' @field url_email_sha256 The pre-signed URL for SHA256 hashed email file character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AppsflyerAudienceSyncCreate <- R6::R6Class(
  "AppsflyerAudienceSyncCreate",
  public = list(
    `container_id` = NULL,
    `url_adid_sha256` = NULL,
    `url_email_sha256` = NULL,

    #' @description
    #' Initialize a new AppsflyerAudienceSyncCreate class.
    #'
    #' @param container_id The container ID of the audience
    #' @param url_adid_sha256 The pre-signed URL for SHA256 hashed GAID/IDFA file
    #' @param url_email_sha256 The pre-signed URL for SHA256 hashed email file
    #' @param ... Other optional arguments.
    initialize = function(`container_id`, `url_adid_sha256` = NULL, `url_email_sha256` = NULL, ...) {
      if (!missing(`container_id`)) {
        if (!(is.character(`container_id`) && length(`container_id`) == 1)) {
          stop(paste("Error! Invalid data for `container_id`. Must be a string:", `container_id`))
        }
        self$`container_id` <- `container_id`
      }
      if (!is.null(`url_adid_sha256`)) {
        if (!(is.character(`url_adid_sha256`) && length(`url_adid_sha256`) == 1)) {
          stop(paste("Error! Invalid data for `url_adid_sha256`. Must be a string:", `url_adid_sha256`))
        }
        self$`url_adid_sha256` <- `url_adid_sha256`
      }
      if (!is.null(`url_email_sha256`)) {
        if (!(is.character(`url_email_sha256`) && length(`url_email_sha256`) == 1)) {
          stop(paste("Error! Invalid data for `url_email_sha256`. Must be a string:", `url_email_sha256`))
        }
        self$`url_email_sha256` <- `url_email_sha256`
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
    #' @return AppsflyerAudienceSyncCreate as a base R list.
    #' @examples
    #' # convert array of AppsflyerAudienceSyncCreate (x) to a data frame
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
    #' Convert AppsflyerAudienceSyncCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AppsflyerAudienceSyncCreateObject <- list()
      if (!is.null(self$`container_id`)) {
        AppsflyerAudienceSyncCreateObject[["container_id"]] <-
          self$`container_id`
      }
      if (!is.null(self$`url_adid_sha256`)) {
        AppsflyerAudienceSyncCreateObject[["url_adid_sha256"]] <-
          self$`url_adid_sha256`
      }
      if (!is.null(self$`url_email_sha256`)) {
        AppsflyerAudienceSyncCreateObject[["url_email_sha256"]] <-
          self$`url_email_sha256`
      }
      return(AppsflyerAudienceSyncCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AppsflyerAudienceSyncCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AppsflyerAudienceSyncCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`container_id`)) {
        self$`container_id` <- this_object$`container_id`
      }
      if (!is.null(this_object$`url_adid_sha256`)) {
        self$`url_adid_sha256` <- this_object$`url_adid_sha256`
      }
      if (!is.null(this_object$`url_email_sha256`)) {
        self$`url_email_sha256` <- this_object$`url_email_sha256`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AppsflyerAudienceSyncCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AppsflyerAudienceSyncCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AppsflyerAudienceSyncCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`container_id` <- this_object$`container_id`
      self$`url_adid_sha256` <- this_object$`url_adid_sha256`
      self$`url_email_sha256` <- this_object$`url_email_sha256`
      self
    },

    #' @description
    #' Validate JSON input with respect to AppsflyerAudienceSyncCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `container_id`
      if (!is.null(input_json$`container_id`)) {
        if (!(is.character(input_json$`container_id`) && length(input_json$`container_id`) == 1)) {
          stop(paste("Error! Invalid data for `container_id`. Must be a string:", input_json$`container_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AppsflyerAudienceSyncCreate: the required field `container_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AppsflyerAudienceSyncCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `container_id` is null
      if (is.null(self$`container_id`)) {
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
      # check if the required `container_id` is null
      if (is.null(self$`container_id`)) {
        invalid_fields["container_id"] <- "Non-nullable required field `container_id` cannot be null."
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
# AppsflyerAudienceSyncCreate$unlock()
#
## Below is an example to define the print function
# AppsflyerAudienceSyncCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AppsflyerAudienceSyncCreate$lock()

