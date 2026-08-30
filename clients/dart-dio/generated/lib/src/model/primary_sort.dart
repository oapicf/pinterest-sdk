//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'primary_sort.g.dart';

class PrimarySort extends EnumClass {

  /// Whether to first sort the report by date or by ID
  @BuiltValueEnumConst(wireName: r'BY_ID')
  static const PrimarySort BY_ID = _$BY_ID;
  /// Whether to first sort the report by date or by ID
  @BuiltValueEnumConst(wireName: r'BY_DATE')
  static const PrimarySort BY_DATE = _$BY_DATE;

  static Serializer<PrimarySort> get serializer => _$primarySortSerializer;

  const PrimarySort._(String name): super(name);

  static BuiltSet<PrimarySort> get values => _$values;
  static PrimarySort valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PrimarySortMixin = Object with _$PrimarySortMixin;

