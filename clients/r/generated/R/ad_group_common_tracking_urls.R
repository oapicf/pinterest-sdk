#' Create a new AdGroupCommonTrackingUrls
#'
#' @description
#' Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
#'
#' @docType class
#' @title AdGroupCommonTrackingUrls
#' @description AdGroupCommonTrackingUrls Class
#' @format An \code{R6Class} generator object
#' @field impression  list(character) [optional]
#' @field click  list(character) [optional]
#' @field engagement  list(character) [optional]
#' @field buyable_button  list(character) [optional]
#' @field audience_verification  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupCommonTrackingUrls <- R6::R6Class(
  "AdGroupCommonTrackingUrls",
  public = list(
    `impression` = NULL,
    `click` = NULL,
    `engagement` = NULL,
    `buyable_button` = NULL,
    `audience_verification` = NULL,
    #' Initialize a new AdGroupCommonTrackingUrls class.
    #'
    #' @description
    #' Initialize a new AdGroupCommonTrackingUrls class.
    #'
    #' @param impression impression
    #' @param click click
    #' @param engagement engagement
    #' @param buyable_button buyable_button
    #' @param audience_verification audience_verification
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`impression` = NULL, `click` = NULL, `engagement` = NULL, `buyable_button` = NULL, `audience_verification` = NULL, ...) {
      if (!is.null(`impression`)) {
        stopifnot(is.vector(`impression`), length(`impression`) != 0)
        sapply(`impression`, function(x) stopifnot(is.character(x)))
        self$`impression` <- `impression`
      }
      if (!is.null(`click`)) {
        stopifnot(is.vector(`click`), length(`click`) != 0)
        sapply(`click`, function(x) stopifnot(is.character(x)))
        self$`click` <- `click`
      }
      if (!is.null(`engagement`)) {
        stopifnot(is.vector(`engagement`), length(`engagement`) != 0)
        sapply(`engagement`, function(x) stopifnot(is.character(x)))
        self$`engagement` <- `engagement`
      }
      if (!is.null(`buyable_button`)) {
        stopifnot(is.vector(`buyable_button`), length(`buyable_button`) != 0)
        sapply(`buyable_button`, function(x) stopifnot(is.character(x)))
        self$`buyable_button` <- `buyable_button`
      }
      if (!is.null(`audience_verification`)) {
        stopifnot(is.vector(`audience_verification`), length(`audience_verification`) != 0)
        sapply(`audience_verification`, function(x) stopifnot(is.character(x)))
        self$`audience_verification` <- `audience_verification`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupCommonTrackingUrls in JSON format
    #' @export
    toJSON = function() {
      AdGroupCommonTrackingUrlsObject <- list()
      if (!is.null(self$`impression`)) {
        AdGroupCommonTrackingUrlsObject[["impression"]] <-
          self$`impression`
      }
      if (!is.null(self$`click`)) {
        AdGroupCommonTrackingUrlsObject[["click"]] <-
          self$`click`
      }
      if (!is.null(self$`engagement`)) {
        AdGroupCommonTrackingUrlsObject[["engagement"]] <-
          self$`engagement`
      }
      if (!is.null(self$`buyable_button`)) {
        AdGroupCommonTrackingUrlsObject[["buyable_button"]] <-
          self$`buyable_button`
      }
      if (!is.null(self$`audience_verification`)) {
        AdGroupCommonTrackingUrlsObject[["audience_verification"]] <-
          self$`audience_verification`
      }
      AdGroupCommonTrackingUrlsObject
    },
    #' Deserialize JSON string into an instance of AdGroupCommonTrackingUrls
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupCommonTrackingUrls
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupCommonTrackingUrls
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`impression`)) {
        self$`impression` <- ApiClient$new()$deserializeObj(this_object$`impression`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`click`)) {
        self$`click` <- ApiClient$new()$deserializeObj(this_object$`click`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`engagement`)) {
        self$`engagement` <- ApiClient$new()$deserializeObj(this_object$`engagement`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`buyable_button`)) {
        self$`buyable_button` <- ApiClient$new()$deserializeObj(this_object$`buyable_button`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`audience_verification`)) {
        self$`audience_verification` <- ApiClient$new()$deserializeObj(this_object$`audience_verification`, "array[character]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupCommonTrackingUrls in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`impression`)) {
          sprintf(
          '"impression":
             [%s]
          ',
          paste(unlist(lapply(self$`impression`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`click`)) {
          sprintf(
          '"click":
             [%s]
          ',
          paste(unlist(lapply(self$`click`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`engagement`)) {
          sprintf(
          '"engagement":
             [%s]
          ',
          paste(unlist(lapply(self$`engagement`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`buyable_button`)) {
          sprintf(
          '"buyable_button":
             [%s]
          ',
          paste(unlist(lapply(self$`buyable_button`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`audience_verification`)) {
          sprintf(
          '"audience_verification":
             [%s]
          ',
          paste(unlist(lapply(self$`audience_verification`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdGroupCommonTrackingUrls
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupCommonTrackingUrls
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupCommonTrackingUrls
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`impression` <- ApiClient$new()$deserializeObj(this_object$`impression`, "array[character]", loadNamespace("openapi"))
      self$`click` <- ApiClient$new()$deserializeObj(this_object$`click`, "array[character]", loadNamespace("openapi"))
      self$`engagement` <- ApiClient$new()$deserializeObj(this_object$`engagement`, "array[character]", loadNamespace("openapi"))
      self$`buyable_button` <- ApiClient$new()$deserializeObj(this_object$`buyable_button`, "array[character]", loadNamespace("openapi"))
      self$`audience_verification` <- ApiClient$new()$deserializeObj(this_object$`audience_verification`, "array[character]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to AdGroupCommonTrackingUrls
    #'
    #' @description
    #' Validate JSON input with respect to AdGroupCommonTrackingUrls and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupCommonTrackingUrls
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
# AdGroupCommonTrackingUrls$unlock()
#
## Below is an example to define the print function
# AdGroupCommonTrackingUrls$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupCommonTrackingUrls$lock()

