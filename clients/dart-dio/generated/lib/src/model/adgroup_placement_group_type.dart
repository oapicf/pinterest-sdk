//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'adgroup_placement_group_type.g.dart';

class AdgroupPlacementGroupType extends EnumClass {

  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'ALL')
  static const AdgroupPlacementGroupType ALL = _$ALL;
  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const AdgroupPlacementGroupType SEARCH = _$SEARCH;
  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'BROWSE')
  static const AdgroupPlacementGroupType BROWSE = _$BROWSE;
  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const AdgroupPlacementGroupType OTHER = _$OTHER;

  static Serializer<AdgroupPlacementGroupType> get serializer => _$adgroupPlacementGroupTypeSerializer;

  const AdgroupPlacementGroupType._(String name): super(name);

  static BuiltSet<AdgroupPlacementGroupType> get values => _$values;
  static AdgroupPlacementGroupType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdgroupPlacementGroupTypeMixin = Object with _$AdgroupPlacementGroupTypeMixin;

