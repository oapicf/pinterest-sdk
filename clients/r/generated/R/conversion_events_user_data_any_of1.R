#' Create a new ConversionEventsUserDataAnyOf1
#'
#' @description
#' ConversionEventsUserDataAnyOf1 Class
#'
#' @docType class
#' @title ConversionEventsUserDataAnyOf1
#' @description ConversionEventsUserDataAnyOf1 Class
#' @format An \code{R6Class} generator object
#' @field em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character)
#' @field client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @field client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsUserDataAnyOf1 <- R6::R6Class(
  "ConversionEventsUserDataAnyOf1",
  public = list(
    `em` = NULL,
    `hashed_maids` = NULL,
    `client_ip_address` = NULL,
    `client_user_agent` = NULL,

    #' @description
    #' Initialize a new ConversionEventsUserDataAnyOf1 class.
    #'
    #' @param hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param ... Other optional arguments.
    initialize = function(`hashed_maids`, `em` = NULL, `client_ip_address` = NULL, `client_user_agent` = NULL, ...) {
      if (!missing(`hashed_maids`)) {
        stopifnot(is.vector(`hashed_maids`), length(`hashed_maids`) != 0)
        sapply(`hashed_maids`, function(x) stopifnot(is.character(x)))
        self$`hashed_maids` <- `hashed_maids`
      }
      if (!is.null(`em`)) {
        stopifnot(is.vector(`em`), length(`em`) != 0)
        sapply(`em`, function(x) stopifnot(is.character(x)))
        self$`em` <- `em`
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
    #' @return ConversionEventsUserDataAnyOf1 in JSON format
    toJSON = function() {
      ConversionEventsUserDataAnyOf1Object <- list()
      if (!is.null(self$`em`)) {
        ConversionEventsUserDataAnyOf1Object[["em"]] <-
          self$`em`
      }
      if (!is.null(self$`hashed_maids`)) {
        ConversionEventsUserDataAnyOf1Object[["hashed_maids"]] <-
          self$`hashed_maids`
      }
      if (!is.null(self$`client_ip_address`)) {
        ConversionEventsUserDataAnyOf1Object[["client_ip_address"]] <-
          self$`client_ip_address`
      }
      if (!is.null(self$`client_user_agent`)) {
        ConversionEventsUserDataAnyOf1Object[["client_user_agent"]] <-
          self$`client_user_agent`
      }
      ConversionEventsUserDataAnyOf1Object
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserDataAnyOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataAnyOf1
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
    #' @return ConversionEventsUserDataAnyOf1 in JSON format
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
    #' Deserialize JSON string into an instance of ConversionEventsUserDataAnyOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataAnyOf1
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`em` <- ApiClient$new()$deserializeObj(this_object$`em`, "array[character]", loadNamespace("openapi"))
      self$`hashed_maids` <- ApiClient$new()$deserializeObj(this_object$`hashed_maids`, "array[character]", loadNamespace("openapi"))
      self$`client_ip_address` <- this_object$`client_ip_address`
      self$`client_user_agent` <- this_object$`client_user_agent`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsUserDataAnyOf1 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hashed_maids`
      if (!is.null(input_json$`hashed_maids`)) {
        stopifnot(is.vector(input_json$`hashed_maids`), length(input_json$`hashed_maids`) != 0)
        tmp <- sapply(input_json$`hashed_maids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsUserDataAnyOf1: the required field `hashed_maids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsUserDataAnyOf1
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `hashed_maids` is null
      if (is.null(self$`hashed_maids`)) {
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
      # check if the required `hashed_maids` is null
      if (is.null(self$`hashed_maids`)) {
        invalid_fields["hashed_maids"] <- "Non-nullable required field `hashed_maids` cannot be null."
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
# ConversionEventsUserDataAnyOf1$unlock()
#
## Below is an example to define the print function
# ConversionEventsUserDataAnyOf1$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsUserDataAnyOf1$lock()

