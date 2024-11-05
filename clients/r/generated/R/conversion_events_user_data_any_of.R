#' Create a new ConversionEventsUserDataAnyOf
#'
#' @description
#' ConversionEventsUserDataAnyOf Class
#'
#' @docType class
#' @title ConversionEventsUserDataAnyOf
#' @description ConversionEventsUserDataAnyOf Class
#' @format An \code{R6Class} generator object
#' @field em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character)
#' @field hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @field client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsUserDataAnyOf <- R6::R6Class(
  "ConversionEventsUserDataAnyOf",
  public = list(
    `em` = NULL,
    `hashed_maids` = NULL,
    `client_ip_address` = NULL,
    `client_user_agent` = NULL,

    #' @description
    #' Initialize a new ConversionEventsUserDataAnyOf class.
    #'
    #' @param em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param ... Other optional arguments.
    initialize = function(`em`, `hashed_maids` = NULL, `client_ip_address` = NULL, `client_user_agent` = NULL, ...) {
      if (!missing(`em`)) {
        stopifnot(is.vector(`em`), length(`em`) != 0)
        sapply(`em`, function(x) stopifnot(is.character(x)))
        self$`em` <- `em`
      }
      if (!is.null(`hashed_maids`)) {
        stopifnot(is.vector(`hashed_maids`), length(`hashed_maids`) != 0)
        sapply(`hashed_maids`, function(x) stopifnot(is.character(x)))
        self$`hashed_maids` <- `hashed_maids`
      }
      if (!is.null(`client_ip_address`)) {
        if (!(is.character(`client_ip_address`) && length(`client_ip_address`) == 1)) {
          stop(paste("Error! Invalid data for `client_ip_address`. Must be a string:", `client_ip_address`))
        }
        self$`client_ip_address` <- `client_ip_address`
      }
      if (!is.null(`client_user_agent`)) {
        if (!(is.character(`client_user_agent`) && length(`client_user_agent`) == 1)) {
          stop(paste("Error! Invalid data for `client_user_agent`. Must be a string:", `client_user_agent`))
        }
        self$`client_user_agent` <- `client_user_agent`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsUserDataAnyOf in JSON format
    toJSON = function() {
      ConversionEventsUserDataAnyOfObject <- list()
      if (!is.null(self$`em`)) {
        ConversionEventsUserDataAnyOfObject[["em"]] <-
          self$`em`
      }
      if (!is.null(self$`hashed_maids`)) {
        ConversionEventsUserDataAnyOfObject[["hashed_maids"]] <-
          self$`hashed_maids`
      }
      if (!is.null(self$`client_ip_address`)) {
        ConversionEventsUserDataAnyOfObject[["client_ip_address"]] <-
          self$`client_ip_address`
      }
      if (!is.null(self$`client_user_agent`)) {
        ConversionEventsUserDataAnyOfObject[["client_user_agent"]] <-
          self$`client_user_agent`
      }
      ConversionEventsUserDataAnyOfObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserDataAnyOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataAnyOf
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`em`)) {
        self$`em` <- ApiClient$new()$deserializeObj(this_object$`em`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`hashed_maids`)) {
        self$`hashed_maids` <- ApiClient$new()$deserializeObj(this_object$`hashed_maids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`client_ip_address`)) {
        self$`client_ip_address` <- this_object$`client_ip_address`
      }
      if (!is.null(this_object$`client_user_agent`)) {
        self$`client_user_agent` <- this_object$`client_user_agent`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsUserDataAnyOf in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`em`)) {
          sprintf(
          '"em":
             [%s]
          ',
          paste(unlist(lapply(self$`em`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`hashed_maids`)) {
          sprintf(
          '"hashed_maids":
             [%s]
          ',
          paste(unlist(lapply(self$`hashed_maids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`client_ip_address`)) {
          sprintf(
          '"client_ip_address":
            "%s"
                    ',
          self$`client_ip_address`
          )
        },
        if (!is.null(self$`client_user_agent`)) {
          sprintf(
          '"client_user_agent":
            "%s"
                    ',
          self$`client_user_agent`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserDataAnyOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataAnyOf
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`em` <- ApiClient$new()$deserializeObj(this_object$`em`, "array[character]", loadNamespace("openapi"))
      self$`hashed_maids` <- ApiClient$new()$deserializeObj(this_object$`hashed_maids`, "array[character]", loadNamespace("openapi"))
      self$`client_ip_address` <- this_object$`client_ip_address`
      self$`client_user_agent` <- this_object$`client_user_agent`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsUserDataAnyOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `em`
      if (!is.null(input_json$`em`)) {
        stopifnot(is.vector(input_json$`em`), length(input_json$`em`) != 0)
        tmp <- sapply(input_json$`em`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsUserDataAnyOf: the required field `em` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsUserDataAnyOf
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `em` is null
      if (is.null(self$`em`)) {
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
      # check if the required `em` is null
      if (is.null(self$`em`)) {
        invalid_fields["em"] <- "Non-nullable required field `em` cannot be null."
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
# ConversionEventsUserDataAnyOf$unlock()
#
## Below is an example to define the print function
# ConversionEventsUserDataAnyOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsUserDataAnyOf$lock()

