//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'adgroup_tracking_feature_type.g.dart';

class AdgroupTrackingFeatureType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'TRENDS')
  static const AdgroupTrackingFeatureType TRENDS = _$TRENDS;
  @BuiltValueEnumConst(wireName: r'CLONE_META')
  static const AdgroupTrackingFeatureType CLONE_META = _$CLONE_META;
  @BuiltValueEnumConst(wireName: r'BULK_EDITOR')
  static const AdgroupTrackingFeatureType BULK_EDITOR = _$BULK_EDITOR;
  @BuiltValueEnumConst(wireName: r'AD_ROTATION')
  static const AdgroupTrackingFeatureType AD_ROTATION = _$AD_ROTATION;

  static Serializer<AdgroupTrackingFeatureType> get serializer => _$adgroupTrackingFeatureTypeSerializer;

  const AdgroupTrackingFeatureType._(String name): super(name);

  static BuiltSet<AdgroupTrackingFeatureType> get values => _$values;
  static AdgroupTrackingFeatureType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdgroupTrackingFeatureTypeMixin = Object with _$AdgroupTrackingFeatureTypeMixin;

