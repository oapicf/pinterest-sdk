#' @docType class
#' @title CatalogsReportParameters
#'
#' @description CatalogsReportParameters Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsReportParameters <- R6::R6Class(
  "CatalogsReportParameters",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsHotelReportParameters", "CatalogsRetailReportParameters"),

    #' @description
    #' Initialize a new CatalogsReportParameters.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsHotelReportParameters", "CatalogsRetailReportParameters"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelReportParameters") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelReportParameters"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailReportParameters") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailReportParameters"
      } else {
        stop(paste("Failed to initialize CatalogsReportParameters with oneOf schemas CatalogsHotelReportParameters, CatalogsRetailReportParameters. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportParameters.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsReportParameters.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportParameters.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsReportParameters.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailReportParameters_result` <- tryCatch({
          `CatalogsRetailReportParameters`$public_methods$validateJSON(input)
          `CatalogsRetailReportParameters_instance` <- `CatalogsRetailReportParameters`$new()
          instance <- `CatalogsRetailReportParameters_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailReportParameters"
          matched_schemas <- append(matched_schemas, "CatalogsRetailReportParameters")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailReportParameters_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailReportParameters_result`["message"])
      }

      `CatalogsHotelReportParameters_result` <- tryCatch({
          `CatalogsHotelReportParameters`$public_methods$validateJSON(input)
          `CatalogsHotelReportParameters_instance` <- `CatalogsHotelReportParameters`$new()
          instance <- `CatalogsHotelReportParameters_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelReportParameters"
          matched_schemas <- append(matched_schemas, "CatalogsHotelReportParameters")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelReportParameters_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelReportParameters_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsReportParameters with oneOf schemas CatalogsHotelReportParameters, CatalogsRetailReportParameters. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsReportParameters with oneOf schemas CatalogsHotelReportParameters, CatalogsRetailReportParameters. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsReportParameters to JSON string.
    #'
    #' @return JSON string representation of the CatalogsReportParameters.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsReportParameters to JSON.
    #'
    #' @return JSON representation of the CatalogsReportParameters.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsReportParameters and
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
#CatalogsReportParameters$unlock()
#
## Below is an example to define the print function
#CatalogsReportParameters$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsReportParameters$lock()

