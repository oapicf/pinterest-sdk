#' @docType class
#' @title CatalogsCreativeAssetsProductGroupFilterKeys
#'
#' @description CatalogsCreativeAssetsProductGroupFilterKeys Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsProductGroupFilterKeys <- R6::R6Class(
  "CatalogsCreativeAssetsProductGroupFilterKeys",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CreativeAssetsIdFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "GoogleProductCategory0Filter", "GoogleProductCategory1Filter", "GoogleProductCategory2Filter", "GoogleProductCategory3Filter", "GoogleProductCategory4Filter", "GoogleProductCategory5Filter", "GoogleProductCategory6Filter", "MediaTypeFilter"),

    #' @description
    #' Initialize a new CatalogsCreativeAssetsProductGroupFilterKeys.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CreativeAssetsIdFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "GoogleProductCategory0Filter", "GoogleProductCategory1Filter", "GoogleProductCategory2Filter", "GoogleProductCategory3Filter", "GoogleProductCategory4Filter", "GoogleProductCategory5Filter", "GoogleProductCategory6Filter", "MediaTypeFilter"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CreativeAssetsIdFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CreativeAssetsIdFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel0Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel0Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel1Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel1Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel2Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel2Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel3Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel3Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel4Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel4Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory0Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory0Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory1Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory1Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory2Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory2Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory3Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory3Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory4Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory4Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory5Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory5Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory6Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory6Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MediaTypeFilter") {
        self$actual_instance <- instance
        self$actual_type <- "MediaTypeFilter"
      } else {
        stop(paste("Failed to initialize CatalogsCreativeAssetsProductGroupFilterKeys with anyOf schemas CreativeAssetsIdFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, GoogleProductCategory0Filter, GoogleProductCategory1Filter, GoogleProductCategory2Filter, GoogleProductCategory3Filter, GoogleProductCategory4Filter, GoogleProductCategory5Filter, GoogleProductCategory6Filter, MediaTypeFilter. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductGroupFilterKeys.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsCreativeAssetsProductGroupFilterKeys.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductGroupFilterKeys.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsCreativeAssetsProductGroupFilterKeys.
    fromJSON = function(input) {
      error_messages <- list()

      `CreativeAssetsIdFilter_result` <- tryCatch({
          `CreativeAssetsIdFilter`$public_methods$validateJSON(input)
          `CreativeAssetsIdFilter_instance` <- `CreativeAssetsIdFilter`$new()
          self$actual_instance <- `CreativeAssetsIdFilter_instance`$fromJSON(input)
          self$actual_type <- "CreativeAssetsIdFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CreativeAssetsIdFilter_result`["error"])) {
        error_messages <- append(error_messages, `CreativeAssetsIdFilter_result`["message"])
      }

      `CustomLabel0Filter_result` <- tryCatch({
          `CustomLabel0Filter`$public_methods$validateJSON(input)
          `CustomLabel0Filter_instance` <- `CustomLabel0Filter`$new()
          self$actual_instance <- `CustomLabel0Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel0Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel0Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel0Filter_result`["message"])
      }

      `CustomLabel1Filter_result` <- tryCatch({
          `CustomLabel1Filter`$public_methods$validateJSON(input)
          `CustomLabel1Filter_instance` <- `CustomLabel1Filter`$new()
          self$actual_instance <- `CustomLabel1Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel1Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel1Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel1Filter_result`["message"])
      }

      `CustomLabel2Filter_result` <- tryCatch({
          `CustomLabel2Filter`$public_methods$validateJSON(input)
          `CustomLabel2Filter_instance` <- `CustomLabel2Filter`$new()
          self$actual_instance <- `CustomLabel2Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel2Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel2Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel2Filter_result`["message"])
      }

      `CustomLabel3Filter_result` <- tryCatch({
          `CustomLabel3Filter`$public_methods$validateJSON(input)
          `CustomLabel3Filter_instance` <- `CustomLabel3Filter`$new()
          self$actual_instance <- `CustomLabel3Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel3Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel3Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel3Filter_result`["message"])
      }

      `CustomLabel4Filter_result` <- tryCatch({
          `CustomLabel4Filter`$public_methods$validateJSON(input)
          `CustomLabel4Filter_instance` <- `CustomLabel4Filter`$new()
          self$actual_instance <- `CustomLabel4Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel4Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel4Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel4Filter_result`["message"])
      }

      `GoogleProductCategory6Filter_result` <- tryCatch({
          `GoogleProductCategory6Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory6Filter_instance` <- `GoogleProductCategory6Filter`$new()
          self$actual_instance <- `GoogleProductCategory6Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory6Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory6Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory6Filter_result`["message"])
      }

      `GoogleProductCategory5Filter_result` <- tryCatch({
          `GoogleProductCategory5Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory5Filter_instance` <- `GoogleProductCategory5Filter`$new()
          self$actual_instance <- `GoogleProductCategory5Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory5Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory5Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory5Filter_result`["message"])
      }

      `GoogleProductCategory4Filter_result` <- tryCatch({
          `GoogleProductCategory4Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory4Filter_instance` <- `GoogleProductCategory4Filter`$new()
          self$actual_instance <- `GoogleProductCategory4Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory4Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory4Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory4Filter_result`["message"])
      }

      `GoogleProductCategory3Filter_result` <- tryCatch({
          `GoogleProductCategory3Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory3Filter_instance` <- `GoogleProductCategory3Filter`$new()
          self$actual_instance <- `GoogleProductCategory3Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory3Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory3Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory3Filter_result`["message"])
      }

      `GoogleProductCategory2Filter_result` <- tryCatch({
          `GoogleProductCategory2Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory2Filter_instance` <- `GoogleProductCategory2Filter`$new()
          self$actual_instance <- `GoogleProductCategory2Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory2Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory2Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory2Filter_result`["message"])
      }

      `GoogleProductCategory1Filter_result` <- tryCatch({
          `GoogleProductCategory1Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory1Filter_instance` <- `GoogleProductCategory1Filter`$new()
          self$actual_instance <- `GoogleProductCategory1Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory1Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory1Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory1Filter_result`["message"])
      }

      `GoogleProductCategory0Filter_result` <- tryCatch({
          `GoogleProductCategory0Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory0Filter_instance` <- `GoogleProductCategory0Filter`$new()
          self$actual_instance <- `GoogleProductCategory0Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory0Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory0Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory0Filter_result`["message"])
      }

      `MediaTypeFilter_result` <- tryCatch({
          `MediaTypeFilter`$public_methods$validateJSON(input)
          `MediaTypeFilter_instance` <- `MediaTypeFilter`$new()
          self$actual_instance <- `MediaTypeFilter_instance`$fromJSON(input)
          self$actual_type <- "MediaTypeFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`MediaTypeFilter_result`["error"])) {
        error_messages <- append(error_messages, `MediaTypeFilter_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsCreativeAssetsProductGroupFilterKeys with anyOf schemas CreativeAssetsIdFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, GoogleProductCategory0Filter, GoogleProductCategory1Filter, GoogleProductCategory2Filter, GoogleProductCategory3Filter, GoogleProductCategory4Filter, GoogleProductCategory5Filter, GoogleProductCategory6Filter, MediaTypeFilter. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CatalogsCreativeAssetsProductGroupFilterKeys to JSON string.
    #'
    #' @return JSON string representation of the CatalogsCreativeAssetsProductGroupFilterKeys.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsCreativeAssetsProductGroupFilterKeys to JSON.
    #'
    #' @return JSON representation of the CatalogsCreativeAssetsProductGroupFilterKeys.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsCreativeAssetsProductGroupFilterKeys and
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
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
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
#CatalogsCreativeAssetsProductGroupFilterKeys$unlock()
#
## Below is an example to define the print function
#CatalogsCreativeAssetsProductGroupFilterKeys$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsCreativeAssetsProductGroupFilterKeys$lock()

