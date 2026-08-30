#' @docType class
#' @title TargetingSpecOperations
#'
#' @description TargetingSpecOperations Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpecOperations <- R6::R6Class(
  "TargetingSpecOperations",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("TargetingSpecOperationAgeBucket", "TargetingSpecOperationAppType", "TargetingSpecOperationAudienceExclude", "TargetingSpecOperationAudienceInclude", "TargetingSpecOperationGender", "TargetingSpecOperationGeo", "TargetingSpecOperationGeoExclude", "TargetingSpecOperationInterest", "TargetingSpecOperationLocale", "TargetingSpecOperationLocation", "TargetingSpecOperationLocationExclude", "TargetingSpecOperationMaximumAge", "TargetingSpecOperationMinimumAge", "TargetingSpecOperationShoppingRetargeting"),

    #' @description
    #' Initialize a new TargetingSpecOperations.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "TargetingSpecOperationAgeBucket", "TargetingSpecOperationAppType", "TargetingSpecOperationAudienceExclude", "TargetingSpecOperationAudienceInclude", "TargetingSpecOperationGender", "TargetingSpecOperationGeo", "TargetingSpecOperationGeoExclude", "TargetingSpecOperationInterest", "TargetingSpecOperationLocale", "TargetingSpecOperationLocation", "TargetingSpecOperationLocationExclude", "TargetingSpecOperationMaximumAge", "TargetingSpecOperationMinimumAge", "TargetingSpecOperationShoppingRetargeting"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationAgeBucket") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationAgeBucket"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationAppType") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationAppType"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationAudienceExclude") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationAudienceExclude"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationAudienceInclude") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationAudienceInclude"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationGender") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationGender"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationGeo") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationGeo"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationGeoExclude") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationGeoExclude"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationInterest") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationInterest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationLocale") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationLocale"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationLocation") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationLocation"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationLocationExclude") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationLocationExclude"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationMaximumAge") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationMaximumAge"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationMinimumAge") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationMinimumAge"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "TargetingSpecOperationShoppingRetargeting") {
        self$actual_instance <- instance
        self$actual_type <- "TargetingSpecOperationShoppingRetargeting"
      } else {
        stop(paste("Failed to initialize TargetingSpecOperations with oneOf schemas TargetingSpecOperationAgeBucket, TargetingSpecOperationAppType, TargetingSpecOperationAudienceExclude, TargetingSpecOperationAudienceInclude, TargetingSpecOperationGender, TargetingSpecOperationGeo, TargetingSpecOperationGeoExclude, TargetingSpecOperationInterest, TargetingSpecOperationLocale, TargetingSpecOperationLocation, TargetingSpecOperationLocationExclude, TargetingSpecOperationMaximumAge, TargetingSpecOperationMinimumAge, TargetingSpecOperationShoppingRetargeting. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperations.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of TargetingSpecOperations.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperations.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of TargetingSpecOperations.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `TargetingSpecOperationAudienceExclude_result` <- tryCatch({
          `TargetingSpecOperationAudienceExclude`$public_methods$validateJSON(input)
          `TargetingSpecOperationAudienceExclude_instance` <- `TargetingSpecOperationAudienceExclude`$new()
          instance <- `TargetingSpecOperationAudienceExclude_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationAudienceExclude"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationAudienceExclude")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationAudienceExclude_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationAudienceExclude_result`["message"])
      }

      `TargetingSpecOperationAudienceInclude_result` <- tryCatch({
          `TargetingSpecOperationAudienceInclude`$public_methods$validateJSON(input)
          `TargetingSpecOperationAudienceInclude_instance` <- `TargetingSpecOperationAudienceInclude`$new()
          instance <- `TargetingSpecOperationAudienceInclude_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationAudienceInclude"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationAudienceInclude")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationAudienceInclude_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationAudienceInclude_result`["message"])
      }

      `TargetingSpecOperationGeo_result` <- tryCatch({
          `TargetingSpecOperationGeo`$public_methods$validateJSON(input)
          `TargetingSpecOperationGeo_instance` <- `TargetingSpecOperationGeo`$new()
          instance <- `TargetingSpecOperationGeo_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationGeo"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationGeo")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationGeo_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationGeo_result`["message"])
      }

      `TargetingSpecOperationGeoExclude_result` <- tryCatch({
          `TargetingSpecOperationGeoExclude`$public_methods$validateJSON(input)
          `TargetingSpecOperationGeoExclude_instance` <- `TargetingSpecOperationGeoExclude`$new()
          instance <- `TargetingSpecOperationGeoExclude_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationGeoExclude"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationGeoExclude")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationGeoExclude_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationGeoExclude_result`["message"])
      }

      `TargetingSpecOperationInterest_result` <- tryCatch({
          `TargetingSpecOperationInterest`$public_methods$validateJSON(input)
          `TargetingSpecOperationInterest_instance` <- `TargetingSpecOperationInterest`$new()
          instance <- `TargetingSpecOperationInterest_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationInterest"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationInterest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationInterest_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationInterest_result`["message"])
      }

      `TargetingSpecOperationLocation_result` <- tryCatch({
          `TargetingSpecOperationLocation`$public_methods$validateJSON(input)
          `TargetingSpecOperationLocation_instance` <- `TargetingSpecOperationLocation`$new()
          instance <- `TargetingSpecOperationLocation_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationLocation"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationLocation")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationLocation_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationLocation_result`["message"])
      }

      `TargetingSpecOperationLocationExclude_result` <- tryCatch({
          `TargetingSpecOperationLocationExclude`$public_methods$validateJSON(input)
          `TargetingSpecOperationLocationExclude_instance` <- `TargetingSpecOperationLocationExclude`$new()
          instance <- `TargetingSpecOperationLocationExclude_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationLocationExclude"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationLocationExclude")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationLocationExclude_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationLocationExclude_result`["message"])
      }

      `TargetingSpecOperationLocale_result` <- tryCatch({
          `TargetingSpecOperationLocale`$public_methods$validateJSON(input)
          `TargetingSpecOperationLocale_instance` <- `TargetingSpecOperationLocale`$new()
          instance <- `TargetingSpecOperationLocale_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationLocale"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationLocale")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationLocale_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationLocale_result`["message"])
      }

      `TargetingSpecOperationAppType_result` <- tryCatch({
          `TargetingSpecOperationAppType`$public_methods$validateJSON(input)
          `TargetingSpecOperationAppType_instance` <- `TargetingSpecOperationAppType`$new()
          instance <- `TargetingSpecOperationAppType_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationAppType"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationAppType")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationAppType_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationAppType_result`["message"])
      }

      `TargetingSpecOperationGender_result` <- tryCatch({
          `TargetingSpecOperationGender`$public_methods$validateJSON(input)
          `TargetingSpecOperationGender_instance` <- `TargetingSpecOperationGender`$new()
          instance <- `TargetingSpecOperationGender_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationGender"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationGender")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationGender_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationGender_result`["message"])
      }

      `TargetingSpecOperationAgeBucket_result` <- tryCatch({
          `TargetingSpecOperationAgeBucket`$public_methods$validateJSON(input)
          `TargetingSpecOperationAgeBucket_instance` <- `TargetingSpecOperationAgeBucket`$new()
          instance <- `TargetingSpecOperationAgeBucket_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationAgeBucket"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationAgeBucket")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationAgeBucket_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationAgeBucket_result`["message"])
      }

      `TargetingSpecOperationShoppingRetargeting_result` <- tryCatch({
          `TargetingSpecOperationShoppingRetargeting`$public_methods$validateJSON(input)
          `TargetingSpecOperationShoppingRetargeting_instance` <- `TargetingSpecOperationShoppingRetargeting`$new()
          instance <- `TargetingSpecOperationShoppingRetargeting_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationShoppingRetargeting"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationShoppingRetargeting")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationShoppingRetargeting_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationShoppingRetargeting_result`["message"])
      }

      `TargetingSpecOperationMaximumAge_result` <- tryCatch({
          `TargetingSpecOperationMaximumAge`$public_methods$validateJSON(input)
          `TargetingSpecOperationMaximumAge_instance` <- `TargetingSpecOperationMaximumAge`$new()
          instance <- `TargetingSpecOperationMaximumAge_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationMaximumAge"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationMaximumAge")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationMaximumAge_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationMaximumAge_result`["message"])
      }

      `TargetingSpecOperationMinimumAge_result` <- tryCatch({
          `TargetingSpecOperationMinimumAge`$public_methods$validateJSON(input)
          `TargetingSpecOperationMinimumAge_instance` <- `TargetingSpecOperationMinimumAge`$new()
          instance <- `TargetingSpecOperationMinimumAge_instance`$fromJSON(input)
          instance_type <- "TargetingSpecOperationMinimumAge"
          matched_schemas <- append(matched_schemas, "TargetingSpecOperationMinimumAge")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`TargetingSpecOperationMinimumAge_result`["error"])) {
        error_messages <- append(error_messages, `TargetingSpecOperationMinimumAge_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into TargetingSpecOperations with oneOf schemas TargetingSpecOperationAgeBucket, TargetingSpecOperationAppType, TargetingSpecOperationAudienceExclude, TargetingSpecOperationAudienceInclude, TargetingSpecOperationGender, TargetingSpecOperationGeo, TargetingSpecOperationGeoExclude, TargetingSpecOperationInterest, TargetingSpecOperationLocale, TargetingSpecOperationLocation, TargetingSpecOperationLocationExclude, TargetingSpecOperationMaximumAge, TargetingSpecOperationMinimumAge, TargetingSpecOperationShoppingRetargeting. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into TargetingSpecOperations with oneOf schemas TargetingSpecOperationAgeBucket, TargetingSpecOperationAppType, TargetingSpecOperationAudienceExclude, TargetingSpecOperationAudienceInclude, TargetingSpecOperationGender, TargetingSpecOperationGeo, TargetingSpecOperationGeoExclude, TargetingSpecOperationInterest, TargetingSpecOperationLocale, TargetingSpecOperationLocation, TargetingSpecOperationLocationExclude, TargetingSpecOperationMaximumAge, TargetingSpecOperationMinimumAge, TargetingSpecOperationShoppingRetargeting. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize TargetingSpecOperations to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the TargetingSpecOperations.
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
    #' Convert TargetingSpecOperations to a base R type
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
    #' Validate the input JSON with respect to TargetingSpecOperations and
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
#TargetingSpecOperations$unlock()
#
## Below is an example to define the print function
#TargetingSpecOperations$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#TargetingSpecOperations$lock()

