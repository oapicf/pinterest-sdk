(ns pinterest-rest-api.specs.item-attributes-request-all-of-image-link
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-attributes-request-all-of-image-link-data
  {
   })

(def item-attributes-request-all-of-image-link-spec
  (ds/spec
    {:name ::item-attributes-request-all-of-image-link
     :spec item-attributes-request-all-of-image-link-data}))
