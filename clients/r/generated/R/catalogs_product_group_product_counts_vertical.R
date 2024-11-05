#' @docType class
#' @title CatalogsProductGroupProductCountsVertical
#'
#' @description CatalogsProductGroupProductCountsVertical Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupProductCountsVertical <- R6::R6Class(
  "CatalogsProductGroupProductCountsVertical",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsProductGroupProductCounts", "CatalogsHotelProductGroupProductCounts", "CatalogsRetailProductGroupProductCounts"),

    #' @description
    #' Initialize a new CatalogsProductGroupProductCountsVertical.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsProductGroupProductCounts", "CatalogsHotelProductGroupProductCounts", "CatalogsRetailProductGroupProductCounts"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsProductGroupProductCounts") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsProductGroupProductCounts"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProductGroupProductCounts") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProductGroupProductCounts"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailProductGroupProductCounts") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailProductGroupProductCounts"
      } else {
        stop(paste("Failed to initialize CatalogsProductGroupProductCountsVertical with oneOf schemas CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupProductCountsVertical.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsProductGroupProductCountsVertical.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupProductCountsVertical.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsProductGroupProductCountsVertical.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailProductGroupProductCounts_result` <- tryCatch({
          `CatalogsRetailProductGroupProductCounts`$public_methods$validateJSON(input)
          `CatalogsRetailProductGroupProductCounts_instance` <- `CatalogsRetailProductGroupProductCounts`$new()
          instance <- `CatalogsRetailProductGroupProductCounts_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailProductGroupProductCounts"
          matched_schemas <- append(matched_schemas, "CatalogsRetailProductGroupProductCounts")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailProductGroupProductCounts_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailProductGroupProductCounts_result`["message"])
      }

      `CatalogsHotelProductGroupProductCounts_result` <- tryCatch({
          `CatalogsHotelProductGroupProductCounts`$public_methods$validateJSON(input)
          `CatalogsHotelProductGroupProductCounts_instance` <- `CatalogsHotelProductGroupProductCounts`$new()
          instance <- `CatalogsHotelProductGroupProductCounts_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelProductGroupProductCounts"
          matched_schemas <- append(matched_schemas, "CatalogsHotelProductGroupProductCounts")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProductGroupProductCounts_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProductGroupProductCounts_result`["message"])
      }

      `CatalogsCreativeAssetsProductGroupProductCounts_result` <- tryCatch({
          `CatalogsCreativeAssetsProductGroupProductCounts`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsProductGroupProductCounts_instance` <- `CatalogsCreativeAssetsProductGroupProductCounts`$new()
          instance <- `CatalogsCreativeAssetsProductGroupProductCounts_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsProductGroupProductCounts"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsProductGroupProductCounts")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsProductGroupProductCounts_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsProductGroupProductCounts_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsProductGroupProductCountsVertical with oneOf schemas CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsProductGroupProductCountsVertical with oneOf schemas CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsProductGroupProductCountsVertical to JSON string.
    #'
    #' @return JSON string representation of the CatalogsProductGroupProductCountsVertical.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsProductGroupProductCountsVertical to JSON.
    #'
    #' @return JSON representation of the CatalogsProductGroupProductCountsVertical.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsProductGroupProductCountsVertical and
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
#CatalogsProductGroupProductCountsVertical$unlock()
#
## Below is an example to define the print function
#CatalogsProductGroupProductCountsVertical$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsProductGroupProductCountsVertical$lock()

