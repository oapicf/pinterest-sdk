(ns pinterest-rest-api.specs.update-mask-field-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-mask-field-type-data
  {
   })

(def update-mask-field-type-spec
  (ds/spec
    {:name ::update-mask-field-type
     :spec update-mask-field-type-data}))
