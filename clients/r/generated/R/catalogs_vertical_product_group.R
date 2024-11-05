#' @docType class
#' @title CatalogsVerticalProductGroup
#'
#' @description CatalogsVerticalProductGroup Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsVerticalProductGroup <- R6::R6Class(
  "CatalogsVerticalProductGroup",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsProductGroup", "CatalogsHotelProductGroup", "CatalogsRetailProductGroup"),

    #' @description
    #' Initialize a new CatalogsVerticalProductGroup.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsProductGroup", "CatalogsHotelProductGroup", "CatalogsRetailProductGroup"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsProductGroup") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsProductGroup"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProductGroup") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProductGroup"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailProductGroup") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailProductGroup"
      } else {
        stop(paste("Failed to initialize CatalogsVerticalProductGroup with oneOf schemas CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalProductGroup.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalProductGroup.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsVerticalProductGroup.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsVerticalProductGroup.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailProductGroup_result` <- tryCatch({
          `CatalogsRetailProductGroup`$public_methods$validateJSON(input)
          `CatalogsRetailProductGroup_instance` <- `CatalogsRetailProductGroup`$new()
          instance <- `CatalogsRetailProductGroup_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailProductGroup"
          matched_schemas <- append(matched_schemas, "CatalogsRetailProductGroup")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailProductGroup_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailProductGroup_result`["message"])
      }

      `CatalogsHotelProductGroup_result` <- tryCatch({
          `CatalogsHotelProductGroup`$public_methods$validateJSON(input)
          `CatalogsHotelProductGroup_instance` <- `CatalogsHotelProductGroup`$new()
          instance <- `CatalogsHotelProductGroup_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelProductGroup"
          matched_schemas <- append(matched_schemas, "CatalogsHotelProductGroup")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProductGroup_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProductGroup_result`["message"])
      }

      `CatalogsCreativeAssetsProductGroup_result` <- tryCatch({
          `CatalogsCreativeAssetsProductGroup`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsProductGroup_instance` <- `CatalogsCreativeAssetsProductGroup`$new()
          instance <- `CatalogsCreativeAssetsProductGroup_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsProductGroup"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsProductGroup")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsProductGroup_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsProductGroup_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsVerticalProductGroup with oneOf schemas CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsVerticalProductGroup with oneOf schemas CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsVerticalProductGroup to JSON string.
    #'
    #' @return JSON string representation of the CatalogsVerticalProductGroup.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsVerticalProductGroup to JSON.
    #'
    #' @return JSON representation of the CatalogsVerticalProductGroup.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsVerticalProductGroup and
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
#CatalogsVerticalProductGroup$unlock()
#
## Below is an example to define the print function
#CatalogsVerticalProductGroup$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsVerticalProductGroup$lock()

