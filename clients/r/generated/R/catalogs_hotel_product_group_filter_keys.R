#' @docType class
#' @title CatalogsHotelProductGroupFilterKeys
#'
#' @description CatalogsHotelProductGroupFilterKeys Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupFilterKeys <- R6::R6Class(
  "CatalogsHotelProductGroupFilterKeys",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("BrandFilter", "CountryFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "HotelIdFilter", "PriceFilter"),

    #' @description
    #' Initialize a new CatalogsHotelProductGroupFilterKeys.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "BrandFilter", "CountryFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "HotelIdFilter", "PriceFilter"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "BrandFilter") {
        self$actual_instance <- instance
        self$actual_type <- "BrandFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CountryFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CountryFilter"
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
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "HotelIdFilter") {
        self$actual_instance <- instance
        self$actual_type <- "HotelIdFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PriceFilter") {
        self$actual_instance <- instance
        self$actual_type <- "PriceFilter"
      } else {
        stop(paste("Failed to initialize CatalogsHotelProductGroupFilterKeys with anyOf schemas BrandFilter, CountryFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, HotelIdFilter, PriceFilter. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFilterKeys.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsHotelProductGroupFilterKeys.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFilterKeys.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsHotelProductGroupFilterKeys.
    fromJSON = function(input) {
      error_messages <- list()

      `PriceFilter_result` <- tryCatch({
          `PriceFilter`$public_methods$validateJSON(input)
          `PriceFilter_instance` <- `PriceFilter`$new()
          self$actual_instance <- `PriceFilter_instance`$fromJSON(input)
          self$actual_type <- "PriceFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`PriceFilter_result`["error"])) {
        error_messages <- append(error_messages, `PriceFilter_result`["message"])
      }

      `HotelIdFilter_result` <- tryCatch({
          `HotelIdFilter`$public_methods$validateJSON(input)
          `HotelIdFilter_instance` <- `HotelIdFilter`$new()
          self$actual_instance <- `HotelIdFilter_instance`$fromJSON(input)
          self$actual_type <- "HotelIdFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`HotelIdFilter_result`["error"])) {
        error_messages <- append(error_messages, `HotelIdFilter_result`["message"])
      }

      `BrandFilter_result` <- tryCatch({
          `BrandFilter`$public_methods$validateJSON(input)
          `BrandFilter_instance` <- `BrandFilter`$new()
          self$actual_instance <- `BrandFilter_instance`$fromJSON(input)
          self$actual_type <- "BrandFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`BrandFilter_result`["error"])) {
        error_messages <- append(error_messages, `BrandFilter_result`["message"])
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

      `CountryFilter_result` <- tryCatch({
          `CountryFilter`$public_methods$validateJSON(input)
          `CountryFilter_instance` <- `CountryFilter`$new()
          self$actual_instance <- `CountryFilter_instance`$fromJSON(input)
          self$actual_type <- "CountryFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CountryFilter_result`["error"])) {
        error_messages <- append(error_messages, `CountryFilter_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsHotelProductGroupFilterKeys with anyOf schemas BrandFilter, CountryFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, HotelIdFilter, PriceFilter. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CatalogsHotelProductGroupFilterKeys to JSON string.
    #'
    #' @return JSON string representation of the CatalogsHotelProductGroupFilterKeys.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsHotelProductGroupFilterKeys to JSON.
    #'
    #' @return JSON representation of the CatalogsHotelProductGroupFilterKeys.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsHotelProductGroupFilterKeys and
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
#CatalogsHotelProductGroupFilterKeys$unlock()
#
## Below is an example to define the print function
#CatalogsHotelProductGroupFilterKeys$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsHotelProductGroupFilterKeys$lock()

