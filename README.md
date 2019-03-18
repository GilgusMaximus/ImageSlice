# Image Slicer

Small program, which slices an image into 126px x 126px (or custom size) image slices. Created for Magica Voxel.

## Getting Started

In order to use the program with 126px x 126px pre configuration, use the ImageSlicer.class, otherwise downlaod the code and replace the 126 with your custom size.

## Download
* [ImageSlicer.class](https://mega.nz/#!ar4F0KAJ!TjTl9WMrkWZfRQJArf55Jx7f8czd_qL7HDd51pvki3s)



### Prerequisites

Requires Java for executing.

Correct execution only with quadratic images, which have widths/heights that are multiples of 126.

## Executing the program

Call the ImageSlicer.class from the console with the following parameters, in the correct order:
1) originalImagePath
2) imageSize (in px)
3) outputFolder
https://mega.nz/#!ar4F0KAJ!TjTl9WMrkWZfRQJArf55Jx7f8czd_qL7HDd51pvki3s

Example call:

```
java ImageSlicer C:/Users/standard/images/insertCoolImage.png 504 C:/Users/standard/images/sclices
```

