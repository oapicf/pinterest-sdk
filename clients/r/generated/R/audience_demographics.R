#' Create a new AudienceDemographics
#'
#' @description
#' Audience demographics
#'
#' @docType class
#' @title AudienceDemographics
#' @description AudienceDemographics Class
#' @format An \code{R6Class} generator object
#' @field ages Ages distribution. list(\link{AudienceDemographicValue}) [optional]
#' @field genders Gender distribution. list(\link{AudienceDemographicValue}) [optional]
#' @field devices Device usage distribution. list(\link{AudienceDemographicValue}) [optional]
#' @field metros Geographic metro area distribution. list(\link{AudienceDemographicValue}) [optional]
#' @field countries Country area distribution. list(\link{AudienceDemographicValue}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceDemographics <- R6::R6Class(
  "AudienceDemographics",
  public = list(
    `ages` = NULL,
    `genders` = NULL,
    `devices` = NULL,
    `metros` = NULL,
    `countries` = NULL,
    #' Initialize a new AudienceDemographics class.
    #'
    #' @description
    #' Initialize a new AudienceDemographics class.
    #'
    #' @param ages Ages distribution.
    #' @param genders Gender distribution.
    #' @param devices Device usage distribution.
    #' @param metros Geographic metro area distribution.
    #' @param countries Country area distribution.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ages` = NULL, `genders` = NULL, `devices` = NULL, `metros` = NULL, `countries` = NULL, ...) {
      if (!is.null(`ages`)) {
        stopifnot(is.vector(`ages`), length(`ages`) != 0)
        sapply(`ages`, function(x) stopifnot(R6::is.R6(x)))
        self$`ages` <- `ages`
      }
      if (!is.null(`genders`)) {
        stopifnot(is.vector(`genders`), length(`genders`) != 0)
        sapply(`genders`, function(x) stopifnot(R6::is.R6(x)))
        self$`genders` <- `genders`
      }
      if (!is.null(`devices`)) {
        stopifnot(is.vector(`devices`), length(`devices`) != 0)
        sapply(`devices`, function(x) stopifnot(R6::is.R6(x)))
        self$`devices` <- `devices`
      }
      if (!is.null(`metros`)) {
        stopifnot(is.vector(`metros`), length(`metros`) != 0)
        sapply(`metros`, function(x) stopifnot(R6::is.R6(x)))
        self$`metros` <- `metros`
      }
      if (!is.null(`countries`)) {
        stopifnot(is.vector(`countries`), length(`countries`) != 0)
        sapply(`countries`, function(x) stopifnot(R6::is.R6(x)))
        self$`countries` <- `countries`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceDemographics in JSON format
    #' @export
    toJSON = function() {
      AudienceDemographicsObject <- list()
      if (!is.null(self$`ages`)) {
        AudienceDemographicsObject[["ages"]] <-
          lapply(self$`ages`, function(x) x$toJSON())
      }
      if (!is.null(self$`genders`)) {
        AudienceDemographicsObject[["genders"]] <-
          lapply(self$`genders`, function(x) x$toJSON())
      }
      if (!is.null(self$`devices`)) {
        AudienceDemographicsObject[["devices"]] <-
          lapply(self$`devices`, function(x) x$toJSON())
      }
      if (!is.null(self$`metros`)) {
        AudienceDemographicsObject[["metros"]] <-
          lapply(self$`metros`, function(x) x$toJSON())
      }
      if (!is.null(self$`countries`)) {
        AudienceDemographicsObject[["countries"]] <-
          lapply(self$`countries`, function(x) x$toJSON())
      }
      AudienceDemographicsObject
    },
    #' Deserialize JSON string into an instance of AudienceDemographics
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceDemographics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDemographics
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ages`)) {
        self$`ages` <- ApiClient$new()$deserializeObj(this_object$`ages`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`genders`)) {
        self$`genders` <- ApiClient$new()$deserializeObj(this_object$`genders`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`devices`)) {
        self$`devices` <- ApiClient$new()$deserializeObj(this_object$`devices`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`metros`)) {
        self$`metros` <- ApiClient$new()$deserializeObj(this_object$`metros`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`countries`)) {
        self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceDemographics in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ages`)) {
          sprintf(
          '"ages":
          [%s]
',
          paste(sapply(self$`ages`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`genders`)) {
          sprintf(
          '"genders":
          [%s]
',
          paste(sapply(self$`genders`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`devices`)) {
          sprintf(
          '"devices":
          [%s]
',
          paste(sapply(self$`devices`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`metros`)) {
          sprintf(
          '"metros":
          [%s]
',
          paste(sapply(self$`metros`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`countries`)) {
          sprintf(
          '"countries":
          [%s]
',
          paste(sapply(self$`countries`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AudienceDemographics
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceDemographics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDemographics
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ages` <- ApiClient$new()$deserializeObj(this_object$`ages`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      self$`genders` <- ApiClient$new()$deserializeObj(this_object$`genders`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      self$`devices` <- ApiClient$new()$deserializeObj(this_object$`devices`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      self$`metros` <- ApiClient$new()$deserializeObj(this_object$`metros`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[AudienceDemographicValue]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to AudienceDemographics
    #'
    #' @description
    #' Validate JSON input with respect to AudienceDemographics and throw an exception if invalid
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
    #' @return String representation of AudienceDemographics
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
# AudienceDemographics$unlock()
#
## Below is an example to define the print function
# AudienceDemographics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceDemographics$lock()

