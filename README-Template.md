# Image Slicer

Small program, which slices an image into 126px x 126px (or custom size) image slices. Created for Magica Voxel.

## Getting Started

In order to use the program with 126px x 126px pre configuration, use the ImageSlicer.class, otherwise downlaod the code and replace the 126 with your custom size.

### Prerequisites

Requires Java for executing.

Correct execution only with images quadratic images, which have widths/heights that are multiples of 126.

## Executing the program

Call the ImageSlicer.class from the console with the following parameters, in the correct order:
1) originalImagePath
2) imageSize (in px)
3) outputFolder


Example call:

```
java ImageSlicer.class C:/Users/standard/images/insertCoolImage.png 504 C:/Users/standard/images/sclices
```

