(ns pinterest-rest-api.specs.creative-assets-id-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def creative-assets-id-filter-data
  {
   (ds/req :CREATIVE_ASSETS_ID) catalogs-product-group-multiple-string-criteria-spec
   })

(def creative-assets-id-filter-spec
  (ds/spec
    {:name ::creative-assets-id-filter
     :spec creative-assets-id-filter-data}))
