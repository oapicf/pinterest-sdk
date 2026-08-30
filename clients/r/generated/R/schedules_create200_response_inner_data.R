#' @docType class
#' @title SchedulesCreate200ResponseInnerData
#'
#' @description SchedulesCreate200ResponseInnerData Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SchedulesCreate200ResponseInnerData <- R6::R6Class(
  "SchedulesCreate200ResponseInnerData",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("Schedule", "SchedulesCreate200ResponseInnerDataOneOf"),

    #' @description
    #' Initialize a new SchedulesCreate200ResponseInnerData.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "Schedule", "SchedulesCreate200ResponseInnerDataOneOf"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "Schedule") {
        self$actual_instance <- instance
        self$actual_type <- "Schedule"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "SchedulesCreate200ResponseInnerDataOneOf") {
        self$actual_instance <- instance
        self$actual_type <- "SchedulesCreate200ResponseInnerDataOneOf"
      } else {
        stop(paste("Failed to initialize SchedulesCreate200ResponseInnerData with oneOf schemas Schedule, SchedulesCreate200ResponseInnerDataOneOf. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of SchedulesCreate200ResponseInnerData.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of SchedulesCreate200ResponseInnerData.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of SchedulesCreate200ResponseInnerData.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of SchedulesCreate200ResponseInnerData.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `Schedule_result` <- tryCatch({
          `Schedule`$public_methods$validateJSON(input)
          `Schedule_instance` <- `Schedule`$new()
          instance <- `Schedule_instance`$fromJSON(input)
          instance_type <- "Schedule"
          matched_schemas <- append(matched_schemas, "Schedule")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`Schedule_result`["error"])) {
        error_messages <- append(error_messages, `Schedule_result`["message"])
      }

      `SchedulesCreate200ResponseInnerDataOneOf_result` <- tryCatch({
          `SchedulesCreate200ResponseInnerDataOneOf`$public_methods$validateJSON(input)
          `SchedulesCreate200ResponseInnerDataOneOf_instance` <- `SchedulesCreate200ResponseInnerDataOneOf`$new()
          instance <- `SchedulesCreate200ResponseInnerDataOneOf_instance`$fromJSON(input)
          instance_type <- "SchedulesCreate200ResponseInnerDataOneOf"
          matched_schemas <- append(matched_schemas, "SchedulesCreate200ResponseInnerDataOneOf")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`SchedulesCreate200ResponseInnerDataOneOf_result`["error"])) {
        error_messages <- append(error_messages, `SchedulesCreate200ResponseInnerDataOneOf_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into SchedulesCreate200ResponseInnerData with oneOf schemas Schedule, SchedulesCreate200ResponseInnerDataOneOf. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into SchedulesCreate200ResponseInnerData with oneOf schemas Schedule, SchedulesCreate200ResponseInnerDataOneOf. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize SchedulesCreate200ResponseInnerData to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the SchedulesCreate200ResponseInnerData.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert SchedulesCreate200ResponseInnerData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to SchedulesCreate200ResponseInnerData and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#SchedulesCreate200ResponseInnerData$unlock()
#
## Below is an example to define the print function
#SchedulesCreate200ResponseInnerData$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#SchedulesCreate200ResponseInnerData$lock()

