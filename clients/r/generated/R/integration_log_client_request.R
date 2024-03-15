#' Create a new IntegrationLogClientRequest
#'
#' @description
#' HTTP request details included in the log sent by the client.
#'
#' @docType class
#' @title IntegrationLogClientRequest
#' @description IntegrationLogClientRequest Class
#' @format An \code{R6Class} generator object
#' @field method  character
#' @field host HTTP request host from host header. character
#' @field path HTTP request path. character
#' @field request_headers HTTP request headers as key-value pairs. named list(character) [optional]
#' @field response_headers HTTP response headers as key-value pairs. named list(character) [optional]
#' @field response_status_code  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogClientRequest <- R6::R6Class(
  "IntegrationLogClientRequest",
  public = list(
    `method` = NULL,
    `host` = NULL,
    `path` = NULL,
    `request_headers` = NULL,
    `response_headers` = NULL,
    `response_status_code` = NULL,
    #' Initialize a new IntegrationLogClientRequest class.
    #'
    #' @description
    #' Initialize a new IntegrationLogClientRequest class.
    #'
    #' @param method method
    #' @param host HTTP request host from host header.
    #' @param path HTTP request path.
    #' @param request_headers HTTP request headers as key-value pairs.
    #' @param response_headers HTTP response headers as key-value pairs.
    #' @param response_status_code response_status_code
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`method`, `host`, `path`, `request_headers` = NULL, `response_headers` = NULL, `response_status_code` = NULL, ...) {
      if (!missing(`method`)) {
        if (!(`method` %in% c("GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH"))) {
          stop(paste("Error! \"", `method`, "\" cannot be assigned to `method`. Must be \"GET\", \"HEAD\", \"POST\", \"PUT\", \"DELETE\", \"CONNECT\", \"OPTIONS\", \"TRACE\", \"PATCH\".", sep = ""))
        }
        if (!(is.character(`method`) && length(`method`) == 1)) {
          stop(paste("Error! Invalid data for `method`. Must be a string:", `method`))
        }
        self$`method` <- `method`
      }
      if (!missing(`host`)) {
        if (!(is.character(`host`) && length(`host`) == 1)) {
          stop(paste("Error! Invalid data for `host`. Must be a string:", `host`))
        }
        self$`host` <- `host`
      }
      if (!missing(`path`)) {
        if (!(is.character(`path`) && length(`path`) == 1)) {
          stop(paste("Error! Invalid data for `path`. Must be a string:", `path`))
        }
        self$`path` <- `path`
      }
      if (!is.null(`request_headers`)) {
        stopifnot(is.vector(`request_headers`), length(`request_headers`) != 0)
        sapply(`request_headers`, function(x) stopifnot(is.character(x)))
        self$`request_headers` <- `request_headers`
      }
      if (!is.null(`response_headers`)) {
        stopifnot(is.vector(`response_headers`), length(`response_headers`) != 0)
        sapply(`response_headers`, function(x) stopifnot(is.character(x)))
        self$`response_headers` <- `response_headers`
      }
      if (!is.null(`response_status_code`)) {
        if (!(is.numeric(`response_status_code`) && length(`response_status_code`) == 1)) {
          stop(paste("Error! Invalid data for `response_status_code`. Must be an integer:", `response_status_code`))
        }
        self$`response_status_code` <- `response_status_code`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogClientRequest in JSON format
    #' @export
    toJSON = function() {
      IntegrationLogClientRequestObject <- list()
      if (!is.null(self$`method`)) {
        IntegrationLogClientRequestObject[["method"]] <-
          self$`method`
      }
      if (!is.null(self$`host`)) {
        IntegrationLogClientRequestObject[["host"]] <-
          self$`host`
      }
      if (!is.null(self$`path`)) {
        IntegrationLogClientRequestObject[["path"]] <-
          self$`path`
      }
      if (!is.null(self$`request_headers`)) {
        IntegrationLogClientRequestObject[["request_headers"]] <-
          self$`request_headers`
      }
      if (!is.null(self$`response_headers`)) {
        IntegrationLogClientRequestObject[["response_headers"]] <-
          self$`response_headers`
      }
      if (!is.null(self$`response_status_code`)) {
        IntegrationLogClientRequestObject[["response_status_code"]] <-
          self$`response_status_code`
      }
      IntegrationLogClientRequestObject
    },
    #' Deserialize JSON string into an instance of IntegrationLogClientRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogClientRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogClientRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`method`)) {
        if (!is.null(this_object$`method`) && !(this_object$`method` %in% c("GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH"))) {
          stop(paste("Error! \"", this_object$`method`, "\" cannot be assigned to `method`. Must be \"GET\", \"HEAD\", \"POST\", \"PUT\", \"DELETE\", \"CONNECT\", \"OPTIONS\", \"TRACE\", \"PATCH\".", sep = ""))
        }
        self$`method` <- this_object$`method`
      }
      if (!is.null(this_object$`host`)) {
        self$`host` <- this_object$`host`
      }
      if (!is.null(this_object$`path`)) {
        self$`path` <- this_object$`path`
      }
      if (!is.null(this_object$`request_headers`)) {
        self$`request_headers` <- ApiClient$new()$deserializeObj(this_object$`request_headers`, "map(character)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`response_headers`)) {
        self$`response_headers` <- ApiClient$new()$deserializeObj(this_object$`response_headers`, "map(character)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`response_status_code`)) {
        self$`response_status_code` <- this_object$`response_status_code`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogClientRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`method`)) {
          sprintf(
          '"method":
            "%s"
                    ',
          self$`method`
          )
        },
        if (!is.null(self$`host`)) {
          sprintf(
          '"host":
            "%s"
                    ',
          self$`host`
          )
        },
        if (!is.null(self$`path`)) {
          sprintf(
          '"path":
            "%s"
                    ',
          self$`path`
          )
        },
        if (!is.null(self$`request_headers`)) {
          sprintf(
          '"request_headers":
            "%s"
          ',
          jsonlite::toJSON(lapply(self$`request_headers`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`response_headers`)) {
          sprintf(
          '"response_headers":
            "%s"
          ',
          jsonlite::toJSON(lapply(self$`response_headers`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`response_status_code`)) {
          sprintf(
          '"response_status_code":
            %d
                    ',
          self$`response_status_code`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of IntegrationLogClientRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogClientRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogClientRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`method`) && !(this_object$`method` %in% c("GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH"))) {
        stop(paste("Error! \"", this_object$`method`, "\" cannot be assigned to `method`. Must be \"GET\", \"HEAD\", \"POST\", \"PUT\", \"DELETE\", \"CONNECT\", \"OPTIONS\", \"TRACE\", \"PATCH\".", sep = ""))
      }
      self$`method` <- this_object$`method`
      self$`host` <- this_object$`host`
      self$`path` <- this_object$`path`
      self$`request_headers` <- ApiClient$new()$deserializeObj(this_object$`request_headers`, "map(character)", loadNamespace("openapi"))
      self$`response_headers` <- ApiClient$new()$deserializeObj(this_object$`response_headers`, "map(character)", loadNamespace("openapi"))
      self$`response_status_code` <- this_object$`response_status_code`
      self
    },
    #' Validate JSON input with respect to IntegrationLogClientRequest
    #'
    #' @description
    #' Validate JSON input with respect to IntegrationLogClientRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `method`
      if (!is.null(input_json$`method`)) {
        if (!(is.character(input_json$`method`) && length(input_json$`method`) == 1)) {
          stop(paste("Error! Invalid data for `method`. Must be a string:", input_json$`method`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogClientRequest: the required field `method` is missing."))
      }
      # check the required field `host`
      if (!is.null(input_json$`host`)) {
        if (!(is.character(input_json$`host`) && length(input_json$`host`) == 1)) {
          stop(paste("Error! Invalid data for `host`. Must be a string:", input_json$`host`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogClientRequest: the required field `host` is missing."))
      }
      # check the required field `path`
      if (!is.null(input_json$`path`)) {
        if (!(is.character(input_json$`path`) && length(input_json$`path`) == 1)) {
          stop(paste("Error! Invalid data for `path`. Must be a string:", input_json$`path`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogClientRequest: the required field `path` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogClientRequest
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
      # check if the required `method` is null
      if (is.null(self$`method`)) {
        return(FALSE)
      }

      # check if the required `host` is null
      if (is.null(self$`host`)) {
        return(FALSE)
      }

      # check if the required `path` is null
      if (is.null(self$`path`)) {
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
      # check if the required `method` is null
      if (is.null(self$`method`)) {
        invalid_fields["method"] <- "Non-nullable required field `method` cannot be null."
      }

      # check if the required `host` is null
      if (is.null(self$`host`)) {
        invalid_fields["host"] <- "Non-nullable required field `host` cannot be null."
      }

      # check if the required `path` is null
      if (is.null(self$`path`)) {
        invalid_fields["path"] <- "Non-nullable required field `path` cannot be null."
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
# IntegrationLogClientRequest$unlock()
#
## Below is an example to define the print function
# IntegrationLogClientRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogClientRequest$lock()

