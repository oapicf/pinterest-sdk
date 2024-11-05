(ns pinterest-rest-api.specs.media-type-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def media-type-filter-data
  {
   (ds/req :MEDIA_TYPE) catalogs-product-group-multiple-media-types-criteria-spec
   })

(def media-type-filter-spec
  (ds/spec
    {:name ::media-type-filter
     :spec media-type-filter-data}))
