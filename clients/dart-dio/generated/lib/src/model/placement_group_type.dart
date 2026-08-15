//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'placement_group_type.g.dart';

class PlacementGroupType extends EnumClass {

  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'ALL')
  static const PlacementGroupType ALL = _$ALL;
  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const PlacementGroupType SEARCH = _$SEARCH;
  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'BROWSE')
  static const PlacementGroupType BROWSE = _$BROWSE;
  /// Campaign placement group type
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const PlacementGroupType OTHER = _$OTHER;

  static Serializer<PlacementGroupType> get serializer => _$placementGroupTypeSerializer;

  const PlacementGroupType._(String name): super(name);

  static BuiltSet<PlacementGroupType> get values => _$values;
  static PlacementGroupType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PlacementGroupTypeMixin = Object with _$PlacementGroupTypeMixin;

