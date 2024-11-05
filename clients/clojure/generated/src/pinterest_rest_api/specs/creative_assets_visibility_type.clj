(ns pinterest-rest-api.specs.creative-assets-visibility-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def creative-assets-visibility-type-data
  {
   })

(def creative-assets-visibility-type-spec
  (ds/spec
    {:name ::creative-assets-visibility-type
     :spec creative-assets-visibility-type-data}))
