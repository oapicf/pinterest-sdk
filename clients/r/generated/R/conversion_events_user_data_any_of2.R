#' Create a new ConversionEventsUserDataAnyOf2
#'
#' @description
#' ConversionEventsUserDataAnyOf2 Class
#'
#' @docType class
#' @title ConversionEventsUserDataAnyOf2
#' @description ConversionEventsUserDataAnyOf2 Class
#' @format An \code{R6Class} generator object
#' @field em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character
#' @field client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsUserDataAnyOf2 <- R6::R6Class(
  "ConversionEventsUserDataAnyOf2",
  public = list(
    `em` = NULL,
    `hashed_maids` = NULL,
    `client_ip_address` = NULL,
    `client_user_agent` = NULL,

    #' @description
    #' Initialize a new ConversionEventsUserDataAnyOf2 class.
    #'
    #' @param client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param ... Other optional arguments.
    initialize = function(`client_ip_address`, `client_user_agent`, `em` = NULL, `hashed_maids` = NULL, ...) {
      if (!missing(`client_ip_address`)) {
        if (!(is.character(`client_ip_address`) && length(`client_ip_address`) == 1)) {
          stop(paste("Error! Invalid data for `client_ip_address`. Must be a string:", `client_ip_address`))
        }
        self$`client_ip_address` <- `client_ip_address`
      }
      if (!missing(`client_user_agent`)) {
        if (!(is.character(`client_user_agent`) && length(`client_user_agent`) == 1)) {
          stop(paste("Error! Invalid data for `client_user_agent`. Must be a string:", `client_user_agent`))
        }
        self$`client_user_agent` <- `client_user_agent`
      }
      if (!is.null(`em`)) {
        stopifnot(is.vector(`em`), length(`em`) != 0)
        sapply(`em`, function(x) stopifnot(is.character(x)))
        self$`em` <- `em`
      }
      if (!is.null(`hashed_maids`)) {
        stopifnot(is.vector(`hashed_maids`), length(`hashed_maids`) != 0)
        sapply(`hashed_maids`, function(x) stopifnot(is.character(x)))
        self$`hashed_maids` <- `hashed_maids`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsUserDataAnyOf2 in JSON format
    toJSON = function() {
      ConversionEventsUserDataAnyOf2Object <- list()
      if (!is.null(self$`em`)) {
        ConversionEventsUserDataAnyOf2Object[["em"]] <-
          self$`em`
      }
      if (!is.null(self$`hashed_maids`)) {
        ConversionEventsUserDataAnyOf2Object[["hashed_maids"]] <-
          self$`hashed_maids`
      }
      if (!is.null(self$`client_ip_address`)) {
        ConversionEventsUserDataAnyOf2Object[["client_ip_address"]] <-
          self$`client_ip_address`
      }
      if (!is.null(self$`client_user_agent`)) {
        ConversionEventsUserDataAnyOf2Object[["client_user_agent"]] <-
          self$`client_user_agent`
      }
      ConversionEventsUserDataAnyOf2Object
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserDataAnyOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataAnyOf2
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
    #' @return ConversionEventsUserDataAnyOf2 in JSON format
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
    #' Deserialize JSON string into an instance of ConversionEventsUserDataAnyOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataAnyOf2
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`em` <- ApiClient$new()$deserializeObj(this_object$`em`, "array[character]", loadNamespace("openapi"))
      self$`hashed_maids` <- ApiClient$new()$deserializeObj(this_object$`hashed_maids`, "array[character]", loadNamespace("openapi"))
      self$`client_ip_address` <- this_object$`client_ip_address`
      self$`client_user_agent` <- this_object$`client_user_agent`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsUserDataAnyOf2 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `client_ip_address`
      if (!is.null(input_json$`client_ip_address`)) {
        if (!(is.character(input_json$`client_ip_address`) && length(input_json$`client_ip_address`) == 1)) {
          stop(paste("Error! Invalid data for `client_ip_address`. Must be a string:", input_json$`client_ip_address`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsUserDataAnyOf2: the required field `client_ip_address` is missing."))
      }
      # check the required field `client_user_agent`
      if (!is.null(input_json$`client_user_agent`)) {
        if (!(is.character(input_json$`client_user_agent`) && length(input_json$`client_user_agent`) == 1)) {
          stop(paste("Error! Invalid data for `client_user_agent`. Must be a string:", input_json$`client_user_agent`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsUserDataAnyOf2: the required field `client_user_agent` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsUserDataAnyOf2
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `client_ip_address` is null
      if (is.null(self$`client_ip_address`)) {
        return(FALSE)
      }

      # check if the required `client_user_agent` is null
      if (is.null(self$`client_user_agent`)) {
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
      # check if the required `client_ip_address` is null
      if (is.null(self$`client_ip_address`)) {
        invalid_fields["client_ip_address"] <- "Non-nullable required field `client_ip_address` cannot be null."
      }

      # check if the required `client_user_agent` is null
      if (is.null(self$`client_user_agent`)) {
        invalid_fields["client_user_agent"] <- "Non-nullable required field `client_user_agent` cannot be null."
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
# ConversionEventsUserDataAnyOf2$unlock()
#
## Below is an example to define the print function
# ConversionEventsUserDataAnyOf2$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsUserDataAnyOf2$lock()

